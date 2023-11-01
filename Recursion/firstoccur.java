// find the first occurence of an element in an array

public class firstoccur {   
    public static int check(int a[], int key,int i) {
        if (a[i]==key) {
            return i;
        }
        if (i==a.length-1){
            return -1;
        }
        return check(a,key,i+1);
    }    
    public static void main(String args[]) {
        int a[]={1,2,4,3,5,6,4,3,2,4};
        int key = 10;
        System.out.print(check(a,key,0));
    }
    
}
