public class stocks{
    public static void main(String args[]){
        int a[]={7,1,5,3,6,4};
        stock(a);
    }
    public static void stock(int a[]){
        int buy =a[0];
        int Max = 0;
        int n= a.length;
        for(int i=0;i<n;i++){
            // profit/loss for all days
            int sell= a[i]-buy;
            Max = Math.max(Max,sell);
            buy = Math.min(buy,a[i]);
            
        }System.out.print(Max);
    }
}