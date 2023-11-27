import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        for(Integer i : arr1) {
            set.add(i);
        }
        for(Integer i : arr2) {
            set.add(i);
        }
        System.out.println("Union of 2 arrays is = "+set.size());
        set.clear();
        int count = 0;
        for(Integer i : arr1) {
            set.add(i);
        }
        for(Integer i : arr2) {
            if(set.contains(i)) {
                count++;
                set.remove(i);
            }
        }
        System.out.println("Intersections of 2 array = "+ count);
    }
}
