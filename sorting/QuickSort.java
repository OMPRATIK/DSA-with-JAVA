public class QuickSort {
    public static void printArray(int a[]) {
        for (int i=0; i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void quickSort(int a[],int si,int ei) {
        if(si>=ei) {
            return;
        }
        //pivot
        int pi = partition(a,si,ei);
        quickSort(a,si,pi-1);
        quickSort(a,pi+1,ei);
    }
    public static int partition(int a [],int si , int ei) {
        int pivot = a[ei];
        int i = si-1; // to make place for elements smaller than pivot

        for(int j=si;j<ei;j++) {
            if(a[j]<=pivot) {
                i++;
                //swap
                int temp =a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // correct place for pivot
        i++;    
            int temp = a[ei];
            a[ei] = a[i];
            a[i] = temp;
            return i;
    }
    public static void main(String args[]) {
        int a[] = {5,7,2,3,4,1,3,5,0};
        quickSort(a,0,a.length-1);
        printArray(a);
    }
}
