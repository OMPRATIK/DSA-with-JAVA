public class incre {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[]) {
        for(int i =0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selection(int arr[]) {
        for(int i =0;i<arr.length;i++) {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[minPos]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void insertion(int arr[]) {
        for(int i =1;i<arr.length;i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void count(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            max = Math.max(arr[i],max);
        }
        int arr2[] = new int[max+1];
        for(int i=0;i<arr.length;i++) {
            arr2[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<arr2.length;i++) {
            while(arr2[i]>0) {
                arr[j] = i;
                arr2[i]--;
                j++;
            }
        }
    }
    public static void merge(int arr[],int si,int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si +(ei-si)/2;
        
    }
    public static void main(String[] args) {
        int arr[] = {23,5,6,3,1,7,8,1};
        //bubbleSort(arr);
        //selection(arr);
        //insertion(arr);
        count(arr);
        printArr(arr);
    }
}
