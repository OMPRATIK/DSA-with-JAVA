import java.util.*;
public class stackUsingDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();
        //push
        public void push(int data) {
            deque.addLast(data);
        }
        //pop
        public int pop() {
            return deque.removeLast();
        }
        //peek
        public int peek() {
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
    }
}
