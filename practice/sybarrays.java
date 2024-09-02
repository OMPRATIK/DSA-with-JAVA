public class sybarrays {
    public static void main (String args[]){
        int a[]={2,3,4,5,6,7,8,9};
        sub(a);
    }
    public static void sub(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i; k<=j;k++){
                    System.out.print(a[k] + " ");
                }System.out.println();
            }System.out.println();
        }
    }
    
}
