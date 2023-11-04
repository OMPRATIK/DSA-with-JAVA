import java.util.*;
public class nextGreaterstack {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGrt[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nextGrt[i] = -1;
            }
            else {
                nextGrt[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGrt.length;i++) {
            System.out.print(nextGrt[i]+" ");
        }
    }
}
