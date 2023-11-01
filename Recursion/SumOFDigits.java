// sum  of digits with recursion
public class SumOFDigits {
    static int Sum(int n) {
        if(n==0) {
            return 0;
        }
        int sum = n%10 +Sum(n/10);
        return sum;

    }
    public static void main(String args[]) {
        int n = 253;
        System.out.print(Sum(n));

    }
}
