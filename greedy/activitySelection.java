import java.util.*;
class actvitySelection{
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //sorting ending index
        int act[][] = new int[start.length][3];
        for(int i=0;i<act.length;i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }
        Arrays.sort(act,Comparator.comparingDouble(o -> o[2]));
        // sorted based on end time activities
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        maxAct = 1;
        ans.add(0);
        int lastEnd = act[0][2];
        for(int i=1;i<act.length;i++) {
            if(act[i][1] >= lastEnd) {
                maxAct++;
                ans.add(act[i][0]);
                lastEnd = act[i][2];
            }
        }
        System.out.println("Maximum Activities : "+ maxAct);
        for(int i =0;i<ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}