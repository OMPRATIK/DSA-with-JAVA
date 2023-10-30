// Selection sort!!

public class selectionsort {
    public static void main(String args[]){
        int arr[] = {1,0,2};
        selection(arr);     
    }
    public static void selection(int a[]){
        for(int i =0; i<a.length-1;i++){
            // Assume index with min value is i
            int minPos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minPos]>a[j]){
                    minPos = j; 
                }
            }//swap
            int temp = a[minPos];
            a[minPos]= a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    }
