public class permu {
    public static void permutation(String str,String newStr) {
        if(str.isEmpty()) {
            System.out.println(newStr);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            String aux = str.substring(0, i) + str.substring(i+1);
            permutation(aux, newStr+ch);
        }
    }
    public static void main(String[] args) {
        permutation("abc", "");
    }
}
