// fibonacci with recursion

public class fibonacci {
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        int fibona = fibo(n-1) +fibo(n-2);
        return fibona;
    }
    public static void main(String args[]){
        int n =5;
        System.out.print(fibo(n));
    }
    
}
