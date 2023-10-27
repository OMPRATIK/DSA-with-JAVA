import java.util.*;
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser =sc.nextFloat();
        Float total = pencil + pen + eraser;
        float gst = total + ((18f/100) * total);
        System.out.println(total);
        System.out.println(gst);

    }
    
}
