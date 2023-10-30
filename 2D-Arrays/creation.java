// how to create a 2D array
import java.util.*;
public class creation{
    // To find the key
    public static boolean search(int a[][],int key){
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a[0].length;j++){
                if(key==a[i][j]){
                    System.out.print("It is present at"+" "+i+","+j);
                    return true;
                }
            }
        }System.out.print("Key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m= matrix[0].length;

        Scanner sc =new Scanner(System.in);
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        } for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
    }
    search(matrix,6);

}
}