import java.util.*;
public class MiniimumJump {
    public static int getMinJumps(int nums[]) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1); 
        dp[n-1] = 0;

        for(int i=n-2;i>=0;i--) {
            int steps = nums[i];
            int ans = Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n;j++) {
                if(dp[j] != -1) {
                    ans = Math.min(ans,dp[j] + 1);// + 1 means 1 jump
                }
            }
            if(ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int num[] = {2,3,1,1,4};
        System.out.println(getMinJumps(num));
    }
}
