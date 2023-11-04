import java.util.*;
public class MaxAraeaHisto {
    public static int maxArea(int arr[]) {
        int maxiArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        //Next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            }
            else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next smaller left
        s = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            }
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Area
        for(int i=0;i<arr.length;i++) {
            int currArea = arr[i] * (nsr[i]-nsl[i]-1);
            maxiArea = Math.max(currArea,maxiArea);
        }
        return maxiArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,2};
        System.out.println(maxArea(arr));
    }
}
