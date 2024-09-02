// check if the number is palindrome no or not?
import java.util.*;
public class q7 {

    public static void pal(int n){
        int rev = 0;
        int palo = n;

        while(n>0){
            int last = n%10;
            rev = (rev *10) +last ; 
            n = n/10;

        }
        System.out.println(rev);
        if(rev == palo){
            System.out.print("Palandrome no");
        }
        else{
            System.out.print("Not a palandrome no");
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        pal(n);
    }
    
}
