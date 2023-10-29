import java.util.*;
public class studenstatus {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int marks = sc.nextInt();
    String report = (marks>33)?  "Pass" : "Fail";
    System.out.print(report);

    }
}
