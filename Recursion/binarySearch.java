// Binary Search with recursion

public class binarySearch {
    public static int binarySearch(int a[],int key,int si,int ei) {
        if (si>ei) {
            return -1;
        }
        int mid = (si+ei)/2;
        if(a[mid]==key ) {
            return mid;
        }
        if(mid<key) {
            return binarySearch(a,key,mid+1,ei);
        }
        return binarySearch(a,key,si,mid-1);
        
    }
    public static void main(String args[]) {
        int a[] ={2,3,4,5,44,66,77,206,350};
        System.out.print(binarySearch(a,35,0,a.length-1));
    }
}
