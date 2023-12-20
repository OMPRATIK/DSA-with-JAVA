public class LCSubstring {

    public static int LongestCommmonSustring(String str1,String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n+1;i++) {
            for(int j=0;j<m+1;j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        int finalAns = 0;
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<m+1;j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    finalAns = Math.max(finalAns,dp[i][j]);
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        return finalAns;
    }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        System.out.println(LongestCommmonSustring(str1,str2));

    }
}
