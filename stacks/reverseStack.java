import java.util.Stack;
public class reverseStack {
    public static void pushBottom(Stack<Integer> s,int num) {
        if(s.isEmpty()) {
            s.push(num);
            return;
        }
        int top = s.pop();
        pushBottom(s, num);
        s.push(top);
    }
    public static void printStack(Stack<Integer>s) {
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top =s.pop();
        reverse(s);
        pushBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        printStack(s);
    }
}
