public class transpose {
    public static void main(String args[]){
        int a[][] ={{1,2,3},
                    {4,5,6}};
        transpose(a);
    }

    public static void transpose(int a[][]){
        int row = a.length;
        int column=a[0].length;
        int b[][] = new int[column][row];

        for(int i=0 ;i<row;i++){
            for(int j=0; j<column; j++){
                b[j][i]= a[i][j];
            }
        }for(int i=0 ;i<column;i++){
            for(int j=0; j<row;j++){
                System.out.print(b[i][j] +" ");
            }System.out.println();
        }
    }   
}
