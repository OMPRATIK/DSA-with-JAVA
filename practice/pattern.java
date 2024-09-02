public class pattern{
    public static void pat(int n){
        for(int i=1; i<=n; i++){
            
            for( int j=1; j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print(n + " ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }   
    }
    public static void main(String args[]){
        pat(6);
    }
}
