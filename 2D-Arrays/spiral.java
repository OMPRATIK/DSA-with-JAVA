// print matrix in spiral fashion

public class spiral {
    public static void main(String args[]){
        int matrix[][]= {{1 ,2 ,3 ,4, 17},
                         {5 ,6 ,7 ,8 ,18},
                         {9 ,10,11,12,19},
                         {13,14,15,16,20},
                         {21,22,23,24,25}};
    spiral(matrix);
    }
    public static void spiral(int a[][]){
        int Srow=0;
        int Erow= a.length-1;
        int Scol=0;
        int Ecol=a[0].length-1;

        while(Srow<=Scol && Scol<=Ecol){
            // TOP
            for(int j=Scol;j<=Ecol;j++){
                System.out.print(a[Srow][j] +" ");
                
            }
            // RIGHT
            for(int i=Srow+1; i<=Erow;i++){
                System.out.print(a[i][Ecol] +" ");
               
            }
            // BOTTOM
            for(int j=Ecol-1; j>=Scol;j--){
                // if rows < columns
                if(Srow==Erow){
                    break;
                }
                System.out.print(a[Erow][j] +" ");
            }
            // LEFT
            for(int i=Erow-1;i>=Srow+1;i--){
                if(Scol==Ecol){
                    break;
                }
                System.out.print(a[i][Scol] +" ");
            }
            Srow++;
            Scol++;
            Erow--;
            Ecol--;
        }
        
    }
}
