// max sum subarray with kadanes algo

public class kadane {
    public static void main(String args[]){
        int a[]= {-2,-3,-4,-1,-2,-1,-5,-3};
        kadane(a);
    }
    public static void kadane(int a[]){
        // Maximum sum
         int ms = Integer.MIN_VALUE;
        // Current sum
        int cs = 0;                      
        for(int i=0; i<a.length; i++){
            cs += a[i];
            ms = Math.max(cs,ms);          
            // for negative sum, sum is taken 0
            if(cs<0){
                cs =0;               
            }    
        }
        System.out.print("Our maximum subarray sum is "+ ms);
    }
    

    
}
