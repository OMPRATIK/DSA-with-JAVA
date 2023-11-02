// check if ArrayList is monotonic or not
import java.util.ArrayList;
import java.util.*;
public class q1 {
    public static boolean monotone(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i)<list.get(i+1)) {
                inc =false;
            }
            if(list.get(i)>list.get(i+1)) {
                dec =false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        System.out.println(monotone(list));
        

    }
}
