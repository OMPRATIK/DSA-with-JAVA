public class matrixMult {
    public static void matrixMulti(int arr[][],int arr1[][]) {
        if(arr[0].length != arr1.length ) {
            System.out.println("Not possible");
            return;
        }
        int result[][] = new int[arr.length][arr1[0].length];

            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr1[0].length;j++) {
                    int sum=0;
                    for(int k=0;k<arr1.length;k++) {
                        sum += arr[i][k]*arr1[k][j];
                    }
                    result[i][j] = sum;
                }
            }
            printMatrix(result);
    }
    public static void printMatrix(int arr[][]) {
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr[0].length;j++) {
                    System.out.print(arr[i][j] + " ");
                }System.out.println();
            }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {2,2},
            {2,2},
            {2,2}
        };
        int arr1[][] = {
            {2},
            {2},
            
        };
        matrixMulti(arr, arr1);

    }
}
