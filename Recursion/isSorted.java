// check if array is sorted or not

public class isSorted {

    public static boolean isSorted(int a[], int i){
        if(i==a.length-1) {
            return true;
        }
        if(a[i]>a[i+1]) {
            return false;
        }
        return isSorted(a,i+1);
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        System.out.print(isSorted(a,0));

    }
    
}
