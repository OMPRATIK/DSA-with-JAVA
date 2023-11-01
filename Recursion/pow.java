public class pow {
    public static void binStr(int n,int i ,String str) {
        if(i==n) {
            System.out.println(str);
            return;
        }
        binStr(n,i+1,str+"0");
        
        binStr(n,i+1,str+"1");
    }
    public static void main(String[] args) {
        binStr(3,0,"");
    }
}
