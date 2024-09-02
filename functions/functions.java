import java.util.*;

public class functions {
    public static void printhw(){
        System.out.println("Hello World");
    }
            //parameters or formal parameters
    public static int sumof(int num1 ,int num2){
        int sum = num1 + num2;
        System.out.println("Sum is :" + sum);
        return sum;
    }
    public static void main(String args[]){
        printhw();
    

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sumof(a , b); // actual parameters or arguments
    }
}
