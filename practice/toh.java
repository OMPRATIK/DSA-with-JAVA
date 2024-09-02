public class toh {
    public static void towerOfHanoi(int n,char a, char b ,char c) {
        if(n>0) {
            towerOfHanoi(n-1, a, c, b);
            System.out.printf("Put discc %d from %c to %c\n",n,a,c);
            towerOfHanoi(n-1, b, a, c);
        }
    }
    public static void main(String[] args) {
        towerOfHanoi(2, 'A', 'B', 'C');
    }
}
