//Rat maze problem
public class q1 {
    public static boolean isSafe(int maze[][],int i,int j) {
        return(i>=0 && j>=0 && i<maze.length && j<maze.length && maze[i][j]==1);
    }
    public static void mazeWays(int maze[][],int way[][],int i,int j,int n) {
        if(i==n-1 && j==n-1 && maze[i][j]==1) {
            way[i][j] = 1;
            printMaze(way);
            return;
        }
        if(isSafe(maze,i,j)) {
            way[i][j] = 1;
            maze[i][j] = 0;
            mazeWays(maze, way, i+1, j, n);
            mazeWays(maze, way, i, j+1, n);
            mazeWays(maze, way, i-1, j, n);
            mazeWays(maze, way, i, j-1, n);
            way[i][j] = 0;
            maze[i][j] = 1;
        }
        
    }
    public static void printMaze(int arr[][]) {
        System.out.println("---------------------");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = {
            {1,1,1,1},
            {1,0,0,1},
            {1,0,0,1},
            {1,1,1,1},
        };
        int n = maze.length;
        int  ways[][] = new int[n][n];
        mazeWays(maze,ways, 0, 0, n);
    }
}
