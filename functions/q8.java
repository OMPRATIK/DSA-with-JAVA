// sum of digits of an integer!!
import java.util.*;
public class q8 {
    public static void sum(int n){
        int sum = 0;
        while(n>0){
            int lasdig = n%10;
            sum = sum+lasdig;
            n /=10;
        }System.out.print(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sum(n);

    }
    
}
