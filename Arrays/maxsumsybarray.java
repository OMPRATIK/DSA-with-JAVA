// Maximum sum sub arrays!

public class maxsumsybarray {
    public static void maxsum(int numbers[]){       
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){ 

            for(int j=i; j<numbers.length; j++){
                int curr_sum = 0; 

                for(int k=i ; k<=j; k++){                    
                    curr_sum += numbers[k];                
                }
                System.out.println(curr_sum);
                if (max_sum<curr_sum){
                    max_sum = curr_sum;
                }             
            }
        }
        System.out.print("Maximum sum sub array is "+max_sum);
    }

    public static void main(String args[]){
        int a[]= {2,4,6,8,10};
        maxsum(a);

    }
    
}
