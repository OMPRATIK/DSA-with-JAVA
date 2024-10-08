public class Merging {
    public static void merge(int arr[],int si, int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        merge(arr,si,mid);
        merge(arr,mid+1,ei);
        mergeSort(arr,si,mid,ei);
    }
    public static void mergeSort(int arr[],int si,int mid,int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei) {
            if(arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        while(j<=ei) {
            temp[k++] = arr[j++];
        }
        for(k=0,i=si;k<temp.length;i++,k++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,7,11,1,5,4,1};
        merge(arr,0,arr.length-1);
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
