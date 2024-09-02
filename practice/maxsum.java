public class maxsum {
    public static void main(String args[]){
        int a[]={2,3,4,5,6,7};
        maxsumsub(a);

    }

    // Max sum subarray
public static void maxsumsub(int a[]){
    int maxsum = Integer.MIN_VALUE;
    int n = a.length;
    for(int i=0 ; i <n;i++){
        for(int j=i; j<n; j++){
            int sum =0;
            for(int k=i; k<=j;k++){
                sum += a[k];
                maxsum = Math.max(sum,maxsum);
                    

            }
            }
        }System.out.print(maxsum);
    }
}
    


