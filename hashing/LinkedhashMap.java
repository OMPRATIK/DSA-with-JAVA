import java.util.*;
public class LinkedhashMap {
    public static void main(String[] args) {
       LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
       lhm.put("India", 100);
       lhm.put("China", 99);
       lhm.put("USA", 20);
       System.out.println(lhm);

       TreeMap<String, Integer> tm = new TreeMap<>();
       tm.put("India", 100);
       tm.put("China", 99);
       tm.put("USA", 20);
       System.out.println(tm);
       System.out.println(tm.remove("hello"));
    }
}
