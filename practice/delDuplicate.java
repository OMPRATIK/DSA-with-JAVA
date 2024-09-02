public class delDuplicate {
    public static StringBuilder del(String str,StringBuilder str1,boolean map[],int i) {
        if(i == str.length()) {
            return str1;
        }
        if(map[str.charAt(i) - 'a'] == true) {
            del(str,str1,map,i+1);
        }
        else {
            map[str.charAt(i) - 'a'] = true;
            del(str,str1.append(str.charAt(i)),map,i+1);
        }
        return str1;
    }
    
    public static void main(String[] args) {
        String str = "appllleee";
        System.out.println(del(str,new StringBuilder(""),new boolean[26],0));
    }
}
