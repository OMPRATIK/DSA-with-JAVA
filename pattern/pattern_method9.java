// number pyramid !

public class pattern_method9 {
    public static void numpad(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
            }System.out.println();
            counter++;
        }
    }
        
    public static void main(String args[]){
        numpad(5);
    }
    
}

