import java.util.*;
public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        check(a);
    }

    public static void check(String a){
        int count =0;
        for(int i=0;i<a.length();i++){           
            Character ch = a.charAt(i);
            if(ch=='a' ||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }System.out.print(count);
    }
    
}
