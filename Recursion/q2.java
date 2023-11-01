

public class q2 {
 
    
    public static void number(int n) {
        String s[] ={"zero","one", "two","three","four","five","six",
        "seven","eight","nine"};
       if (n==0) {
        return;
       }
       number(n/10);
       System.out.print(s[n%10]+" ");
    }
    public static void main(String args[]) {
        number(2015);
    }
    
}
