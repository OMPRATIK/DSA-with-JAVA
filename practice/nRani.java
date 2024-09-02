public class nRani {
    public static void nRani(char chess[][],int row) {
        if(row == chess.length) {
            printBoard(chess);
            return;
            
        }
    
        for(int j=0;j<chess.length;j++) {
            if(isSafe(chess,row,j)) {
                chess[row][j] = 'Q';
                nRani(chess,row+1);
                chess[row][j] = 'X';
            }
        }
}
    public static void printBoard(char chess[][]) {
        System.out.println("----------------------");
        for(int i=0;i<chess.length;i++) {
            for(int j=0;j<chess.length;j++) {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char chess[][],int row,int cols) {
        for(int i=row-1;i>=0;i--) {
            if(chess[i][cols]=='Q') {
                return false;
            }
        }
        for(int i=row-1, j=cols+1;i>=0 && j<chess.length;i--,j++ ) {
            if(chess[i][j]=='Q') {
                return false;
            }
        }
        for(int i=row-1, j=cols-1;i>=0 && j>=0;i--,j-- ) {
            if(chess[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n =5;
        char chess[][] = new char[n][n];
        for(int i=0;i<chess.length;i++) {
            for(int j=0;j<chess.length;j++) {
                chess[i][j] = 'X';
            }
        }
        nRani(chess,0);
    }
}

