// Find all indices of a key and print them with recursion
public class q1 {
    public static void findkey(int a[],int key,int i) {
        if(i==a.length) {
            return;
        }
        
        if(a[i]==key) {
            System.out.print(i+" ");
        }
        
        findkey(a,key,i+1);
    }
    public static void main(String args[]) {
        int a[] ={1,2,3,4,3,3,4,5,3,4,3,6,7,3};
        findkey(a,30,0);
}
}