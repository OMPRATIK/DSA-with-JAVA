import java.util.*;
public class IteratingHash {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 300);
        hm.put("China", 290);
        hm.put("Russia", 100);
        hm.put("USA", 50);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k:keys) {
            System.out.println("Keys= "+k+", value= "+hm.get(k));
        }
    }
}
