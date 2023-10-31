// set ith bit or change i th bit to 1

public class setITH {
    public static void bit(int n,int i){
        int bitmask = 1<<i;

        System.out.print(n | bitmask);
    }

    public static void main(String args[]){
        bit(10,2);
    }
}
