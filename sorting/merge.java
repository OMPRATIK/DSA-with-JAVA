// merge Sort
public class merge {
    public static void print(int a[]) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] +" ");
        }
    }
    public static void mergeSort(int a[],int si,int ei) {
        if (si>=ei) {
            return;
        }
        int mid =si + (ei-si)/2;

        mergeSort(a,si,mid);
        mergeSort(a,mid+1,ei);
        merge1(a,si,mid,ei);
    }
    public static void merge1(int a[],int si,int mid,int ei) {
        int temp[] = new int[ei-si+1];
        int i =si; //iterator for left
        int j =mid+1; //iterator for right
        int k = 0;// iterator for temp array
        while(i<=mid && j<=ei) {
            if(a[i] < a[j]) {
                temp[k] = a[i];
                i++; 
            }
            else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        //left
        while(i<=mid) {
            temp[k++] = a[i++];
        }
        //right
        while(j<=ei) {
            temp[k++] = a[j++];
        }
        //copy temporary to original array
        for(k=0, i=si; k<temp.length; k++,i++) {
            a[i] = temp[k];
        }   
    }   
    public static void main(String args[]) {
        int a [] = {6,3,9,5,2,8};
        mergeSort(a,0,a.length-1);
        print(a);
    }
}
