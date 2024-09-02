public class exponential {
    public static int fastExponent(int x,int n) {
        if(n==0) {
            return 1;
        }
        int half = fastExponent(x,n/2);
        int ans = half*half;
        if (n%2==1) {
            return x*ans;
        }    
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(fastExponent(2, 5));
    }
}
