public class towerOfHanoi {
    public static void towerOfHanoi(int n,String a,String b,String c) {
        if(n>0) {
        towerOfHanoi(n-1, a, c, b);
        System.out.println("move "+n+" disc from "+a+" to "+c);
        towerOfHanoi(n-1, b, a, c);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}
