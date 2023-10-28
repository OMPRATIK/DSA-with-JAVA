// Maximum sum subarrays with the help of prefix sum
public class prefixsum {
    public static void main(String args[]){
        int a[]={1,-2,6,-1,3};
        prefix(a);
    }
    //prefix sum method
    public static void prefix(int a[]){
        // to make prefix array
        int prefix[]= new int[a.length];
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = a[0];
        for(int i=1 ; i< a.length; i++){
            prefix[i]= prefix[i-1] +a[i];
        }
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i ; j<a.length;j++){
                int end =j;
                int currSum = start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print("The max sum is "+maxSum);
    }
    
}
