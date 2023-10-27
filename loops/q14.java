// Table of a number n

import java.util.*;
public class q14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n = sc.nextInt();
        int a = 1;
        int product = 1;

        while(a<=10){
            product = n*a;
            System.out.println(product);
            a++;


        }

    }
    
}
