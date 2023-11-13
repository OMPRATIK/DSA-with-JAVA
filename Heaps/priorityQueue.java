import java.util.Comparator;
import java.util.PriorityQueue;
class priorityQueue {
    static class Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name,int rank) {
        this.name = name;
        this.rank = rank;
    }
    @Override
    public int compareTo(Student s2) {
        return s2.rank-this.rank;
    }
}
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 10));
        pq.add(new Student("B", 2));
        pq.add(new Student("C", 8));
        pq.add(new Student("D", 1));
        while(!pq.isEmpty()) {
            System.out.print(pq.peek().rank +" ");
            pq.remove();
        }
        System.out.println();

    }
}