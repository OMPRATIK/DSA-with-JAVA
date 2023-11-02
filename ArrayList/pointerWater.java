import java.util.ArrayList;

public class pointerWater {
    public static int storeWater(ArrayList<Integer>height) {
        int maxwater = 0;
        int lp =0;
        int rp = height.size()-1;

        while(lp<rp) {
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxwater = Math.max(currWater,maxwater);
            if(height.get(lp)<height.get(rp)) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storeWater(list));
    }
}
