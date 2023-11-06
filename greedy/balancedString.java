public class balancedString {
    public static int balanced(String str) {
        int l = 0;
        int r = 0;
        int ans = 0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch == 'L') l++;
            if(ch == 'R') r++;
            if(l == r) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println(balanced(str));
        
    }
}
