import java.util.*;

public class IterationHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Jharsuguda");
        cities.add("Bhubaneswar");
        cities.add("hyderabad");
        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+ " ");
        }
        System.out.println();
        for(String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Jharsuguda");
        ts.add("Bhubaneswar");
        ts.add("hyderabad");
        System.out.println(ts);
    }
}
