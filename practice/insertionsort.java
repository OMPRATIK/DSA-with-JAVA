public class insertionsort{
    public static void main(String args[]){
        int a[] = {7,5,6,7,8,9,1,2};
        insertion(a);

        for(int i =0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void insertion(int a[]){
        for(int i=0 ; i<a.length;i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] =a[j];
                j--;
            }a[j+1]=temp;
        }    
    }
}