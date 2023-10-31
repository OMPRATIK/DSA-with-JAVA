public class q2 {

    public static void swap(int a , int b) {
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.print("a="+a+","+"b="+b);
    }
    public static void main(String args[]) {
        int a =5 ;
        int b =2;
        swap(a,b);
    }

}
