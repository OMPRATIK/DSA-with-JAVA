// sum of n natural numbers with recursion

public class sumNatural {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum = sum(n-1)+n;
        return sum;
    }
    public static void main(String args[]){
        int n =5;
        System.out.print(sum(n));
    }
    
}
