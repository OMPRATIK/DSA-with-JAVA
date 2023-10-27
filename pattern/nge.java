import java.util.Arrays;

public class nge {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int ans[] = new int[arr.length];
        int n = arr.length;
        int max = arr[n-1];
        for(int i=n-1;i>=0;i--) {
            if(arr[i] < max) {
                ans[i] = max;     
            }
            else {
                max = arr[i];
                ans[i] = -1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
