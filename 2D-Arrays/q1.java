public class q1 {
    public static void main(String args[]){
        int a[][]={{4,7,8},
                   {7,8,7}};
                   System.out.print(sevens(a));
    }
    public static int sevens(int a[][]){
        int count =0;
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[0].length;j++){
                if(a[i][j]==7){
                    count++;
                }
            }
        }return count;
    }
    
}
