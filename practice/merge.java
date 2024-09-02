public class merge {
    public static void mergeSort(int arr[],int si,int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        int aux[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei) {
            if(arr[i]<arr[j]) {
                aux[k] = arr[i];
                i++;
            }
            else{
                aux[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            aux[k++] = arr[i++];
        }
        while(j<=ei) {
            aux[k++] = arr[j++];
        }
        for(k=0,i=si;k<aux.length;i++,k++) {
            arr[i] = aux[k];
        }
    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {22,4,7,8,1,4,5,1};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
