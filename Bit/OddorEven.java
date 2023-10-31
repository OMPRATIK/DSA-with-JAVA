public class OddorEven {
    public static void main(String args[]){
        OddorEven(3);
        OddorEven(24);

    }
    public static void OddorEven(int n){
        int BitMask = 1 ;
        if((n & BitMask) ==0){
            System.out.println("Even");
        } 
        else{
            System.out.println("Odd");
        }
    }
    
}
