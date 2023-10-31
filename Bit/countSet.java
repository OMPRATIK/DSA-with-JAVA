public class countSet {
    public static void main (String args[]){
        System.out.print(countSet(2));                                                                                                                                                                                                                                                                                                                                                                          

    }
    public static int countSet(int n){
        int count =0;

        while(n>0){
            if((n & 1) !=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    
}
