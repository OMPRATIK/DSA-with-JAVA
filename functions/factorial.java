import java.util.*;
public class factorial {
    public static int fact(int a){
        
        
        int factorial = 1;

        while(a>=1){
            factorial *= a;
            a--;
        }return(factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int x = fact(n);
        System.out.print(x);
    }
    
}
