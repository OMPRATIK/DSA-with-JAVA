public class BinString {
    public static void binaryStrin(int n,String lastDig,String str) {
        if(n==0) {
            System.out.println(str);
            return;
        }
        binaryStrin(n-1, "0", str+"0");
        if(lastDig == "0") {
            binaryStrin(n-1, "1", str+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        binaryStrin(n, "0", "");
    }
}
