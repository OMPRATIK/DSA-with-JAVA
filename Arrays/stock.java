// Best time to buy and sell stocks!
public class stock {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        stocks(prices);
    }
    public static void stocks(int a[]){
        int minimum = a[0];
        int profit = 0;
        for(int i=1;i<a.length;i++){
            // checking selling proice!
               int sell= a[i]-minimum;
               // Checking max profit
               profit = Math.max(profit,sell);
               // taking minimum buy price!
               minimum = Math.min(a[i],minimum);
            }System.out.print(profit);
        }

        }

    
    

