// Maximum profit from stocks
public class q3 {
    public static void main(String args[]){
        int a[]={7,1,5,3,6,4};
        stocks(a);
    }
    public static void stocks(int a[]){
        //let
        int BuyPrice= a[0];
        int Profit =0;
        for(int i=1; i<a.length;i++){
            int sell = a[i]-BuyPrice;
            Profit = Math.max(sell,Profit);
            BuyPrice = Math.min(BuyPrice,a[i]);
        }System.out.print(Profit);
    }
}
