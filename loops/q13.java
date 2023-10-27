// Factorial of a number!

import java.util.*;
public class q13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        while(n>0){
            fact *= n;
            n--;

        }
        System.out.print("Factorial :" + fact);
    }
    
}
