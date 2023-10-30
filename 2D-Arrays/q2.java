public class q2 {
    public static void main(String args[]){
        int a[][] ={{1 ,4, 9},
                    {11,4, 3},
                    {5, 2 ,3}};
        System.out.print(sum(a)); 
    }
    public static int sum(int a[][]){
        int sum=0;
        for(int i=0; i<a.length ;i++){
            for(int j=0; j<a[0].length ;j++){
                if(i==1){
                    sum += a[i][j];
                }
            }
        }return sum;
    }
    
}
