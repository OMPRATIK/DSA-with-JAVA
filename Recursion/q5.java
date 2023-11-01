// Tower of hanoi
public class q5 {
    public static void towerOfHanoi(int n,String a,String b,String c) {
        if(n==1) {
            System.out.println("move "+n+" disc from "+a+" to "+c);
            return;
        }
        towerOfHanoi(n-1, a, c, b);
        System.out.println("move "+n+" disc from "+a+" to "+c);
        towerOfHanoi(n-1, b, a, c);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    }
}
