public class insertion {
    public static void main(String args[]){
        int arr[] = {5,8,9,0,6,4};
       insert(arr);
    }
    public static void insert(int a[]){
        for(int i=1; i<a.length;i++){
            int temp =a[i]; 
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }for(int i=0; i<a.length; i++){           
            System.out.print(a[i]+ " ");
        }
    }
}
