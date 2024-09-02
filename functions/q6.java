// is Even method!!
import java.util.*;
public class q6 {
    
    public static boolean isEven( int n){
        boolean isEven = true;
        if(n%2==0){
            isEven = true;
            
    }
    else{
        isEven = false;
    }return isEven;

    
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number");
    int n = sc.nextInt();
    System.out.print(isEven(n));
}
}
