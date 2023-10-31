
public class palindrome {
    public static void main(String args[]){
       String a = "madam";
       System.out.print(palindrome(a));
    }
    public static boolean palindrome(String a){
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i) != a.charAt(a.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
}
