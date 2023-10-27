// Prime or not?
import java.util.*;
public class q11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i=1 ; i<=n ; i++){
            if(n % i ==0){
                x +=1;


            }
            

            }
            if (x==2){
                System.out.print(" prime");}
            else {
                System.out.print("not Prime");
            }    

            
                
            
        }

    }
    

