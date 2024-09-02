import java.util.Arrays;

public class sort01 {
    public static void sort(int arr[]) {
        int i = 0;
        int j = arr.length-1;
        while(i<j) {
            if(arr[i] ==1 && arr[j]==0) {
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }
            else if(arr[j] ==1) {
                j--;
            }
            else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
