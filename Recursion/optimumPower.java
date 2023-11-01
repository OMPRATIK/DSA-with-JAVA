public class optimumPower {
    public static int optimized(int n , int x) {
        if(x==0) {
            return 1;
        }
        int half = optimized(n , x/2);
        int halfPower = half * half; 

        if(x%2 !=0) {
            halfPower = halfPower *n;
        }
        return halfPower;
    }
    public static void main(String args[]) {
        System.out.print(optimized(2,5));

    }
    
}
