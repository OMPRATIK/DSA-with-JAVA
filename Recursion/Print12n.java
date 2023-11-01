public class Print12n {

    public static void incr(int n){
        if(n==1){
            System.out.print(n +"  ");
            return;
        }        
        incr(n-1);
        System.out.print(n +" "); 
    }
    public static void main(String args[]) {
        int n = 10;
        incr(n);
    }
    
}
