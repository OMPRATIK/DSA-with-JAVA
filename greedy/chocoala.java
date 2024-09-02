import java.util.*;
public class chocoala {
    public static void main(String[] args) {
        int n = 4;//rows    
        int m = 6;//columns
        Integer costVer[] = {2,1,3,1,4}; // m-1
        Integer costHor[] = {4,1,2}; //n-1

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int h = 0,v=0;// pointers to cost
        int hp = 1,vp = 1; // horizontal and vertical pieces
        int cost = 0;
        while(h < costHor.length && v < costVer.length) {
            // vertical cost < hor cost
            if(costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }
        while(v<costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Minimum cost to cut: "+cost);
        
    }
}
