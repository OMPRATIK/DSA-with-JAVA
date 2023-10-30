import java.util.*;
import java.util.Collections;

public class inbuilt {
    public static void main(String args[]){
        Integer arr[] = {6,4,5,3,2,1};
        // (arry name, start index,closing index)
        // Arrays.sort(arr,0,3);

        // descending order sorting
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
    public static void printArr(Integer a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
