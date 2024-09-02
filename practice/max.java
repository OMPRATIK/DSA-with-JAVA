//O(n square) sum

public class max {
    public static void prefix(int a[]){     
        int maxSum = Integer.MIN_VALUE;        
        for(int i=0;i<a.length;i++){
            int sum = 0;
            for(int j=i ; j<a.length;j++){
                sum += a[j];        
                if(maxSum< sum){
                    maxSum = sum;
                }
            }
        }
        System.out.print("The max sum is "+maxSum);
    }
    public static void main(String args[]){
        int a[]= {-2,-4,6,8,-10};
        prefix(a);
    }
    
}
