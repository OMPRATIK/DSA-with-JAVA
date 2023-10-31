public class update {
    public static void main(String args[]){
        update(10,2,1);

    }
    public static void update(int n, int i, int newbit){
      n=  clearbit(n, i);
      int BitMask = newbit<<i;
      System.out.print(n | BitMask);
    }

    public static int clearbit(int n,int i){
        int bitmask = ~(1<<i);
        return (bitmask & n);
    } 
    
}
