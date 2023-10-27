// triangle ABCD!

public class pattern4 {
    public static void main(String args[]){

        int n = 5;
        char ch = 'A';

        for(int i = 1; i<=n; i++){
            for(int col=1 ; col<=i ; col++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }

    }

    
}
