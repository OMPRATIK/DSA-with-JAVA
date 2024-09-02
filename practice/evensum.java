// Even sum in a fibonachi series

public class evensum{
    public static void main(String args[]){
        evensum(8);
    }
     // function for even sum
    public static void evensum(int n){
        int a=0;
        int b=1;
        int sum=0;
        if(n<=1){
            System.out.print(0);
        }
        else{
        for(int i=1;i<=n-2;i++){            
            int c=a+b;
            a=b;
            b=c;            
            if(i%2==0){               
                sum += c;    
            }
        }System.out.println(sum+1);
    }
    }
}