// Search in  a rotated and sorted array

public class modifiedBinary {
    public static void main(String args[]) {
        int a[] = {9,11,12,15,2,4,6,7};
        int target =9;
        System.out.print(BinarySearch(a,target,0,a.length-1));
    }
    public static int BinarySearch(int a[],int target,int si,int ei) {
        if(si>ei) {
            return -1;
        }
        int mid = si +(ei-si)/2;
        if (target==a[mid]) {
            return mid;
        }
        //l1
        if(a[si]<=a[mid]) {
            if(a[si]<=target && a[mid]>=target) {
                return BinarySearch(a,target,si,mid-1);
            }
            else {
                return BinarySearch(a,target,mid+1,ei);
            }
        }
        else {
            if(a[mid]<=target && target<=a[ei]) {
                return BinarySearch(a,target,mid+1,ei);
            }
            else {
                return BinarySearch(a,target,si,mid-1);
            }
        }
    }
}
