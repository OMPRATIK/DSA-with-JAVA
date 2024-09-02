// Binomial coefficient!
import java.util.*;

public class binomial {

    public static int factorial(int n){
        
        int a = 1;
        for(int i=1 ; i<=n ; i++){
            a = a*i;
        } return a;


    }
    public static int biCo(int n , int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int binocoeff = a/(b * c);
        return binocoeff;
    }
    public static void main(String args[]){
        System.out.print(biCo(5, 2));
    }
    
}
