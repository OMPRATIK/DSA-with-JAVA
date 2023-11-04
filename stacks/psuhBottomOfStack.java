import java.util.*;
public class psuhBottomOfStack {
    public static void pushBottom(Stack<Integer> s,int num) {
        if(s.isEmpty()) {
            s.push(num);
            return;
        }
        int top = s.pop();
        pushBottom(s, num);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBottom(s,4);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
 