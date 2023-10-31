// find value of i th bit

public class getITH {
    public static void getBit(int n, int i){
        int bitmask= 1<<i;

        if((n & bitmask)==0){
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }
    }
    public static void main(String args[]){
        getBit(5,2);
    }
    
}
