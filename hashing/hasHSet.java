import java.util.*;
public class hasHSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.print(set);
        set.remove(2);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
