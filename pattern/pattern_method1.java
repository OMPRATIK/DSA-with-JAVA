// hollow rectangle

public class pattern_method1 {
    public static void patt1(int rows , int coln ){

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=coln; j++){
                if(i==1 || i==rows || j==1 || j==coln){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    public static void main(String args[]){
        patt1(8  , 6);
    }
    
}
