// Print subarrays!

public  class subarrays  {
    public static void sub(int numbers[]){
        for(int i=0; i<numbers.length;i++){
            for(int j=i; j<numbers.length; j++){
                for(int k=i ; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }System.out.println();
            }System.out.println();
        }
    }
    public static void main(String args[]){
        int a[]= {1,2,33,55,66,12};
        sub(a);

    }
    
}
