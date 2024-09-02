import java.util.Arrays;

public class bubsort {
    public static void countingSort(int arr[]) {
        int large = arr[0];
        for(int i=1;i<arr.length;i++) {
            large  = Math.max(arr[i],large);
        }
        int newArr[] = new int[large+1];
        for(int i=0;i<arr.length;i++) {
            newArr[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<newArr.length;i++) {
            while(newArr[i]>0) {
                arr[j] = i;
                j++;
                newArr[i]--;
            }
        }
    }
    public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,4,1,6,7,2,7,6};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //countingSort(arr);
        merge(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int arr[],int si, int ei) {
        if(si<ei) {
            int mid = si + (ei-si)/2;
            merge(arr,si,mid);
            merge(arr, mid+1, ei);
            mergeSort(arr,si,mid,ei);
        }
    }
    public static void mergeSort(int arr[],int si,int mid,int ei) {
        int newArr[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei) {
            if(arr[i]<arr[j]) {
                newArr[k] = arr[i];
                i++;
            }
            else {
                newArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            newArr[k++] = arr[i++];
        }
        while(j<=ei) {
            newArr[k++] = arr[j++];
        }
        for(k=0,i=si;k<newArr.length;k++,i++) {
            arr[i] = newArr[k];
        }

    }
    public static void quickSort(int arr[],int si,int ei) {
        int pivot = si + (ei-si)/2 ; //mid
        

    }
}
