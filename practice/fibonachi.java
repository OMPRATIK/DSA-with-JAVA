public class fibonachi {
    public static void fibo(int n){
        int a=0;
        int b=1;
        
        System.out.println(a);
        System.out.println(b);

        for(int i=1 ; i<=n-2 ; i++){
             
            int c= a+b;
            System.out.println(c);
            // changing values

            a=b;
            b=c;

        }
    }
    public static void main(String args[]){
        fibo(8);
    }
    
}
