import java.util.*;
public class random {
 public static void main(String args[]){
    int a =10;
    int b = 20;
    swap(a,b);
    System.out.print(a);
 }

 public static void swap(int a,int b) {
    int temp = a;
    a = b;
    b= temp;

    System.out.print(a +" "+b);
 }
    
}
