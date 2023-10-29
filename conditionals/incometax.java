import java.util.*;
public class incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income< 500000){
            System.out.println("No income tax");
            tax = 0;
        }
        else if (income>=500000 && income<1000000){
            System.out.println("20% income tax");
            tax = (int)(income* 0.2);
        }
        else{
            System.out.print("30% income tax");
            tax = (int)(income*0.3);
        }
        System.out.println("Your tax is " + tax);

    }
    
}
