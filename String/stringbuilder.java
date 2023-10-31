public class stringbuilder {
    public static void main(String args[]){
        StringBuilder a= new StringBuilder("");
         /* O(n) and same loop for string
         will be O(n**2) as its immutable */ 
        
        for(char ch='a';ch<='z';ch++){
            a.append(ch);
        }
        System.out.print(a);
    }
    
}
