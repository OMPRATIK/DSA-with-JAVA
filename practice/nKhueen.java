public class nKhueen {
    public static void printChess(char arr[][]) {
        System.out.println("---------------");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void nQueens(char arr[][],int row) {
        if(row == arr.length) {
            printChess(arr);
            return;
        }   
        for(int j=0;j<arr.length;j++) {
            if(isSafe(arr,row,j)) {
                arr[row][j] = 'Q';
                nQueens(arr, row+1);
                arr[row][j] = 'X';
            }
        }
    }
    public static boolean isSafe(char arr[][],int row ,int cols) {
        //vertical check
        for(int i=row-1;i>=0;i--) {
            if(arr[i][cols]=='Q') {
                return false;
            }
        }
        //right diagonal
        for(int i=row-1,j=cols+1;i>=0 && j<arr.length;i--,j++) {
            if(arr[i][j] == 'Q') {
                return false;
            }
        }   
        //left diagonal
        for(int i=row-1,j=cols-1;i>=0 && j>=0;i--,j--) {
            if(arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        char chess[][] = new char[n][n];
        for(int i=0;i<chess.length;i++) {
            for(int j=0;j<chess.length;j++) {
                chess[i][j] = 'X';
            }
        }
        nQueens(chess, 0);
    }
}
