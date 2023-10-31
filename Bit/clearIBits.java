public class clearIBits {
    public static void main (String args[]){
        System.out.print(endBits(15,2));
    }
    public static int endBits(int n, int i){
        int bitmask = -1<<i;
        return bitmask & n ;
    }
    
}
