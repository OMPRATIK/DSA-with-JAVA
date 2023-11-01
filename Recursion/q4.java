public class q4 {
    public static int subString(String str,String newStr,int n) {
        if(n==str.length()) {
            //System.out.println(newStr);
            if(newStr.charAt(0)== newStr.charAt(newStr.length()-1)) {
                return 1;
            }
            return 0;
        }
        else{
            char ch = str.charAt(n);
            int count=subString(str, newStr+ch, n+1)+subString(str, newStr, n+1);;
            return count;
        }
        
    }
    public static void main(String[] args) {
        String str = "abcab";
        subString(str, "", 0);
    }
}
