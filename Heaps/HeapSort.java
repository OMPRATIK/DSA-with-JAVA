import java.util.*;

public class HeapSort {
    public static void heapify(int arr[],int i,int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxInd = i;

        if(left < size && arr[left] > arr[maxInd]) {
            maxInd = left;
        }
        if(right < size && arr[right] > arr[maxInd]) {
            maxInd = right;
        }
        if(maxInd != i) {
            int temp = arr[i];
            arr[i] = arr[maxInd];
            arr[maxInd] = temp;

            heapify(arr, maxInd, size);
        }
    }
    public static void heapSort(int arr[]) {
        int n = arr.length;
        for(int i=n/2;i>=0;i--) {
            heapify(arr,i,n);
        }
        for(int i=n-1;i>0;i--) {
            int temp =arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
