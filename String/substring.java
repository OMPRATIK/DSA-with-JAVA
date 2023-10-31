public class substring {
    public static String substring(String a,int si,int ei){
        String substr="";
        for(int i=si; i<ei;i++){
            substr += a.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.print(substring(str,0,6));
    }
    
}
