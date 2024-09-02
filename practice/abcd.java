import java.io.*;
import java.util.*;

public class abcd {

    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       String a = sc.nextLine();
       String b = sc.nextLine();
       String c = "";
       
       
       System.out.println(a.length()+b.length());
       if(a.compareTo(b)<0){
           System.out.println("No");
       }
       else{
           System.out.println("Yes");
       }
       ;
       System.out.print(Character.toUpperCase(a.charAt(0)));
       
       for(int i=1 ; i<a.length();i++){
           System.out.print(a.charAt(i));
       }
       System.out.print(Character.toUpperCase(b.charAt(0)));
       for(int i=1 ; i<b.length();i++){
        System.out.print(b.charAt(i));
    }
    }
}

