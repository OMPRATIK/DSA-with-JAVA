// Hollow rectangle pattern

public class pattern5 {
    public static void main(String args[]){
        int n =4;
        for(int i =1 ; i<=n; i++){
            for(int j = 1 ;j<=5;j++ ){
                if(i>1 && i<4  && j>1 && j<5){
                    System.out.print("  ");

                }
                else{
                    System.out.print("* " );
                }
               

            }System.out.println();
        }
    }
    
}
