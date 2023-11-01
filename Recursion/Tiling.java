// Tiling problem for surface of 2 x n and tile size 2 x 1

public class Tiling {
    public static int tile(int n) {
        if (n<2) {
            return 1;
        }
        // vertical
        int vertical = tile(n-1);
        // horizontal
        int horizontal = tile(n-2);
        // total
        return vertical+horizontal;
    }
    public static void main (String args[]) {
        int n =3;
        System.out.print(tile(4));

    }
    
}
