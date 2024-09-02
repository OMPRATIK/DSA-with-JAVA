//print prime no in range!

public class q2 {
    public static boolean IsPrime(int n){
        // corner case for 2
        if(n==2){
            return true;
        }
        boolean IsPrime = true;
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                IsPrime = false;
            }

        } return IsPrime;
   
}
public static void primeInRange(int n){
    for(int i=1 ; i<=n ; i++){
        if(IsPrime(i)){
            System.out.print(i + " ");
        }
    }
}
public static void main(String args[]){
    primeInRange(20);
    }

}
