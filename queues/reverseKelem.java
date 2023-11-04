import java.util.*;
public class reverseKelem {
    public static void reverseK(Queue<Integer> q, int k) {
        int size = q.size();
        if(k>size) {
            System.out.println("invalid value of k");
            return;
        }
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<k; i++) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        for(int i=0; i<size-k; i++) {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverseK(q, 13);
        System.out.println(q);
    }
}
