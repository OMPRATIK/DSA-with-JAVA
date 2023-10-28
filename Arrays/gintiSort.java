public class gintiSort {
    public static void ginatiSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            max = Math.max(arr[i],max);
        }
        int temp[] = new int[max+1];

        for(int j=0;j<arr.length;j++) {
            temp[arr[j]]++;
        }
        int j=0;
        for(int i=0;i<temp.length;i++) {
            while(temp[i]>0) {
                arr[j] = i;
                temp[i]--;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,2,3,8,7,4,5,1,9};
        ginatiSort(arr);
    }
}
