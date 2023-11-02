import java.util.ArrayList;

public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(22);
        list.add(3);
        list.add(14);
        list.add(5);
        list.add(6);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++) {
            max = Math.max(max,list.get(i));
        }
        System.out.printf("Largest number is %d",max);
    }
}
