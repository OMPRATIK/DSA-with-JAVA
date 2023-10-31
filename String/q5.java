//check if strings are similar
import java.util.Arrays;
public class q5 {
    public static void main (String args[]){
        String str1 = "earth";
        String str2 = "Earth";
        similar(str1,str2);
    }
    public static void similar(String str1,String str2){
        str1= str1.toLowerCase();
        str2 =str2.toLowerCase();

        if(str1.length()==str2.length()){
           char st1[]= str1.toCharArray();
           char st2[]= str2.toCharArray();

           Arrays.sort(st1);
           Arrays.sort(st2);
           int counter=0;
           for(int i=0;i<str1.length();i++){
            
            if(st1[i]==st2[i]){
                counter++;
            }
           }if(counter==str1.length()){
            System.out.print("Similar");
           }
        }
        else{
            System.out.print("Not similar");
        }   
    }
}
