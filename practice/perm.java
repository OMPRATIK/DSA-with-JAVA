public class perm {
    public static void findPerm(String str,String ans) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPerm(newStr,ans+currChar);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPerm(str,""); 
    }
}
