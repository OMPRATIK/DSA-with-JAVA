public class selectionsort {
    public static void main(String args[]){
        int a[] = {4,5,7,8,9,1,2,3,45};
        selection(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
    public static void selection(int a[]){
        for(int i=0;i<a.length;i++){
            int minpos=i;
            for(int j=i+1; j<a.length;j++){
                if(a[minpos]>a[j]){
                    minpos = j;
                }
            }int temp = a[i];
            a[i]= a[minpos];
            a[minpos]=temp;
        }  
    }
    
}
