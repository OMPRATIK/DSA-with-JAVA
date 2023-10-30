// Bubble sorting!

public class Bubblesorting{
    public static void main(String args[]){
        int arr[] = {6,4,5,3,1,2};
        bubble(arr);
    }
    // method for bubble sort
    public static void bubble(int a[]){ 
        // Number of turns
        for(int i=0; i<a.length-1;i++){       
            for(int j=0; j< a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    //swap
                    int temp =a[j];
                    a[j]= a[j+1];
                    a[j+1] =temp;                    
                }
            }                                    
        }
        // to print the sorted array
    for(int i=0; i<a.length;i++){
        System.out.print(a[i]+ " ");
    }
    }

}