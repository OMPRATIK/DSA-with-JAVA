import java.util.*;
public class q2 {
    public static ArrayList<Integer> lonely(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++) {
            int count =0;
            boolean lon = true;
            for(int j=0;j<arr.size();j++) {
                if(arr.get(i) == arr.get(j)) count++;
                if(arr.get(j)== arr.get(i)+1 || arr.get(j)==arr.get(i)-1) lon =false;
            }
            if(count == 1 && lon) ans.add(arr.get(i));
        }
        return ans;
    }
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>();
         arr.add(10);
         arr.add(6);
         arr.add(5);
         arr.add(8);
         System.out.println(lonely(arr));
    }
}
