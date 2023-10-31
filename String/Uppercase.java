public class Uppercase {
    public static void main(String args[]){
        String str = "hi i am pratik";
        System.out.print(uppercase(str));
    }
    public static String uppercase(String str){
        StringBuilder a =new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        a.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()){
                a.append(str.charAt(i));
                i++;
                a.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                a.append(str.charAt(i));
            }
        }
        return a.toString();
    }
    
}
