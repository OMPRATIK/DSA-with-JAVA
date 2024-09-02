// decimal to binary!


public class q4 {

    public static void decToBin(int n){
        int bin = 0;
        int pow = 0;


        while(n>0){
            int a = n % 2;
            bin = bin + a* (int)Math.pow(10, pow);
            pow++;
            n/=2;
        }System.out.print("Binary form is " + bin);
    }

        public static void main(String args[]){
            decToBin(23);

        }


    
    
}
