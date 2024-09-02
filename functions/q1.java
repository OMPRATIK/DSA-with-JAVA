// Prime or not using methods

public class q1 {

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
    public static void main(String args[]){
        System.out.print(IsPrime(13));
    }

    
}
