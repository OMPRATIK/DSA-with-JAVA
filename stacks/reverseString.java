import java.util.*;
public class reverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while(index<str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder newStr = new StringBuilder();
        while(!s.isEmpty()) {
            newStr.append(s.peek());
            s.pop();
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "Hello World ";
        System.out.println(reverseString(str));
    }
}
