// factorial with recursion
public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        
        int a = n*fact(n-1);
      return a;
        
    }
    public static void main(String args[]){
        int n =5;
        System.out.print(fact(n));
    }
    
}
