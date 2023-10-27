// Display all numbers by user except multiple of 10
import java.util.*;
public class q10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            
            if(n% 10 == 0){
                continue;
            }System.out.println("Number was :" + n);

        }while(true);
    }
    
}
