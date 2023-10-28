// Element largest in java

public class largest {

    public static int largest(int number[]){
        int largest = Integer.MIN_VALUE;

        for( int i=0 ; i<number.length;i++){
            if(largest<number[i]){
                largest = number[i];
            }
        }return largest;
    }
    public static void main(String args[]){
        int a[]={22,33,44,55,12,432,33,10};
        System.out.print("The largest number is: "+ largest(a));
    }
    
}
