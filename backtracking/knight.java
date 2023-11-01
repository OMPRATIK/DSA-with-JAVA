public class knight {
    public static void knightTour(int chess[][],int i,int j,int n) {
        if(i<0 || j<0 || i>=chess.length || j>=chess.length || chess[i][j]!=0) {
            return;
        }
        else if(n == chess.length*chess.length) {
            chess[i][j]=n;
            printChess(chess);
            chess[i][j] = 0;
            return;
        }
        chess[i][j]=n;
        knightTour(chess, i-2, j+1, n+1);
        knightTour(chess, i-1, j+2, n+1);
        knightTour(chess, i+1, j+2, n+1);
        knightTour(chess, i+2, j=1, n+1);
        knightTour(chess, i+2, j-1, n+1);
        knightTour(chess, i+1, j-2, n+1);
        knightTour(chess, i-1, j-2, n+1);
        knightTour(chess, i-2, j-1, n+1);
        chess[i][j]=0;

    }
    public static void printChess(int chess[][]) {
        for(int i=0;i<chess.length;i++) {
            for(int j=0;j<chess[0].length;j++) {
                System.out.print(chess[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 8;
        int chess[][] = new int[n][n];
        knightTour(chess, 0, 0, 0);
    }
}
