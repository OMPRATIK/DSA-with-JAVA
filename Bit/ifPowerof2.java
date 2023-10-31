public class ifPowerof2 {
    public static void main(String args[]){
        System.out.print(powerof2(5));

    }
    public static boolean powerof2(int n){
        return (n & (n-1))==0;
    }
    
}
