import java.util.*;
// Matrix Chain Multiplication
public class MCM {
    public static int mcm(int arr[],int i,int j) {
        if(i == j) return 0;

        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++) {
            int cost1 = mcm(arr,i,k);
            int cost2 = mcm(arr,k+1,j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans;
    }
    // MEMOIZATION
    public static int mcm2(int arr[],int i,int j,int dp[][]) {
        if(i == j) return 0;
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++) {
            int cost1 = mcm(arr,i,k);
            int cost2 = mcm(arr,k+1,j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans,finalCost);
        }
        return dp[i][j] = ans;
    }
    public static int mcmTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        for(int i=0;i<n;i++) {
            dp[i][i] = 0;
        }

        for(int len=2;len<n;len++) {
            for(int i=1;i<=n-len;i++) {
                int j = i + len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i;k<j;k++) {
                    int c1 = dp[i][k];
                    int c2 = dp[k+1][j];
                    int c3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j],c1+c2+c3);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
        
    }
    public static void print(int dp[][]) {
        for(int i=0;i<dp.length;i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        // int n = arr.length;
        // System.out.println(mcm(arr, 1, n-1));
        // int dp[][] = new int[n][n];
        // for(int i=0;i<n;i++) {
        //     Arrays.fill(dp[i],-1);
        // }
        // System.out.println(mcm2(arr, 1, n-1, dp));
        System.out.println(mcmTab(arr));
    }
}
