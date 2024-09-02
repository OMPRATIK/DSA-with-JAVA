public class selection {
    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[minPos]>arr[j]) {
                    minPos = j;
                }
            }
            int temp =arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void printArray(int arr[] ) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr []= {10,9,8,2,6,5,1};
        selectionSort(arr);
        printArray(arr);
    }
    
}
