public class primePlus {
    public static int prime(int n) {
        int temp = n;
        while(true) {
            int count =0;
            for(int i=1;i<=n;i++) {
                if(n%i==0) count++;
            }
            if(count == 2 && temp !=n) return n;
            n++;
        }
    }
    public static void main(String[] args) {
        System.out.println(prime(13));
    }
}
