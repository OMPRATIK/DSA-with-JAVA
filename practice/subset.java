public class subset {
    public static void Subset(String str, int i,String newStr) {
        if(i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        Subset(str,i+1,newStr+currChar);
        Subset(str,i+1,newStr);
        
    }
    public static void main(String[] args) {
        String str = "abc";
        Subset(str,0,"");
    }
}
