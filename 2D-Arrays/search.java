public class search {
    public static void main(String args[]){
        int m[] []= {{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        search(m,25);
    }
    public static boolean search(int m[][],int key){
        int row =0, col= m[0].length-1;

        while(row< m.length && col>=0){
            if(m[row][col]==key){
                System.out.print("("+row+","+col+")");
                return true;
            }
            else if(key>m[row][col]){
                row++;
            }
            else{
                col--;
            }
        }return false;
    }
    
}
