import java.util.Arrays;

public class nextGreater {
    public static int[] nextGreat(int arr[]) {
        int ans[] = new int[arr.length];
        ans[ans.length-1] = -1;
        for(int i=0;i<arr.length-1;i++) {
            int j = i+1;
            while(j<arr.length) {
                if(arr[j]>arr[i]) {
                    ans[i] = arr[j];
                    break;
                }
                j++;
            }
            if(j==arr.length) ans[i] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        System.out.println(Arrays.toString(nextGreat(arr)));
    }
}
