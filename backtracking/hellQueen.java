public class hellQueen {
    static int count = 0;
    public static int totalNQueens(int n) {
        int chess[][] = new int[n][n];
        nQueens(n,chess,0);
        return count;
    }
    public static void nQueens(int n,int chess[][],int row) {
        if(row == n) {
            count++;
            return;
        }
        for(int j=0;j<n;j++) {
            if(isSafe(n,chess,row,j)){
                chess[row][j] = 1;
                nQueens(n,chess,row+1);
                chess[row][j] = 0;
            }
        }
    }
    public static boolean isSafe(int n,int chess[][],int row,int col) {
        for(int i=row-1;i>=0;i--) {
            if(chess[i][col]==1) {
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++) {
            if(chess[i][j]==1) {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(chess[i][j]==1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(totalNQueens(1));
    }
}
