// Binary Search

public class binary {
    public static void main(String args[]){
        int a[]={1,3,5,7,9,10,15,16};
        System.out.print(binary(a,16));
    }    
    public static int binary(int a[], int key){
        int start= 0;
        int end = a.length-1;
        

        while(start<=end){
            int mid = (start + end)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]>key){
                end = mid-1;
            }
            else if (a[mid]<key){
                start = mid+1;
            }
        }return -1;
    }
}
