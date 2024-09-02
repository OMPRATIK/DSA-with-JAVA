public class abc {
    public static void main(String args[]){
    int rev = 0;
    int n =123;

    while(n>0){
        int last = n%10;
        rev = (rev *10) +last ; 
        n = n/10;

    }
    System.out.print(rev);
}

}
