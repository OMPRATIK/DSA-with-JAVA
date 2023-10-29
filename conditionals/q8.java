// leap year or not !

import java.util.*;
public class q8 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the year :");
        int Year = sc.nextInt();


        if (Year % 400 == 0){
            System.out.print("Its a leap Year");

        }
        else if (Year % 4 ==0 && Year % 100 !=0) {
            System.out.print("Its a leap year");
        }
        else{
            System.out.print("not a leap year");
        }
    }
    
}
