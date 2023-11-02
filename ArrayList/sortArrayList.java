import java.util.Collections; 
import java.util.ArrayList;

public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(22);
        list.add(3);
        list.add(14);
        list.add(5);
        list.add(6);
        System.out.println(list);
        // ascending sort
        Collections.sort(list);
        System.out.println(list);
        // descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }    
}
