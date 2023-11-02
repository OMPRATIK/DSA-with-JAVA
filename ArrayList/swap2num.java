import java.util.ArrayList;

public class swap2num {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        // Swap
        int idx1 =1, idx2 =2;
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }
}
