public class compress {
    public static void main(String args[]){
        String a = "aabbccddef";
        compress(a);
    }
    public static void compress(String a){
        StringBuilder str= new StringBuilder("");

        for(int i=0; i<a.length(); i++){
            Integer count =1;
            while(i<a.length()-1 && a.charAt(i)==a.charAt(i+1)) {
                count++;
                i++;
            }
            str.append(a.charAt(i));
            if(count>1){
                str.append(count);
            }
            
        }System.out.print(str);
    }
    
}
