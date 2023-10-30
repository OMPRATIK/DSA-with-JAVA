// find diagonal sum
public class diagonalSum {
    public static void main(String args[]){
        int matrix[][]= {{1 ,2 ,3 ,4,17 },
        {5 ,6 ,7 ,8 ,18},
        {9 ,10,11,12,19},
        {13,14,15,16,20},
        {21,22,23,24,25}};
        Dsum(matrix);
    }
    public static void Dsum(int a[][]){
        int sum=0;
        // Primary Diagonal
        for(int i=0; i<a.length;i++){
            sum += a[i][i];
            // Secondary diagonal
            if(i != a.length-1-i){
                sum+= a[i][a.length-1-i];
            }
        }System.out.print(sum);
    }
    
}
