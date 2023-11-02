import java.util.ArrayList;

public class multiDimensional {
    public static void main(String[] args) {
       /*   ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);list2.add(4);
        mainList.add(list2);
        System.out.println(mainList);
        */
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=1;i<=5;i++) {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        for(int j=0;j<mainList.size();j++) {
            System.out.println(mainList.get(j));
        }
    }
}
