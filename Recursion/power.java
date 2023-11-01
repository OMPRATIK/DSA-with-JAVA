// power of a number

public class power {
    public static int power(int n, int x) {
        if(x==0) {
            return 1;
        }
        int pow = n* power(n,x-1);
        return pow;
            
    }
    public static void main(String args[]) {
        System.out.print(power(2,10));
    }
}
