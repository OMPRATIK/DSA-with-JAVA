public class clearBit {
    public static void bit(int n,int i){
        int bitmask = ~(1<<i);
        System.out.print(bitmask & n);
    }   
    public static void main(String args[]){
        bit(5,2);
    }
    
}
