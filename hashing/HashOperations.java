import java.util.*;
class HashOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //put function O(1)
        hm.put("India", 500);
        hm.put("China", 490);
        hm.put("USA", 200);
        System.out.println(hm);

        //Get O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("nepal"));

        //Contains O(1)
        System.out.println(hm.containsKey("India"));

        //remove O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty()
        System.out.println(hm.isEmpty());

        //clear()
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}