// Binary to decimal !


public class q3 {

    public static void BinToDec(int b){
        int a = b;
        int pow = 0;
        int d = 0;

        while(b>0){
            int lastDig = b % 10;
            d = d + (lastDig * (int)Math.pow(2 , pow));
            pow++;
            b = b/10;
        }
        System.out.print("decimal of " + a +" = " + d);

    }
    public static void main(String args[]){
        BinToDec(111);
    }
    
}
