public class insertion {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void insert(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            int temp =arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,6,3,0,7,10,9};
        insert(arr);
        printArray(arr);

        
    }
}
