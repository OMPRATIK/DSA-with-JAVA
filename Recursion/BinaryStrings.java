// Print all binary strings with non consecutive 1s

public class BinaryStrings {
    public static void PrintBinary(int n, int Last, String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }
        //work
        PrintBinary(n-1,0,str+"0");
        if (Last==0) {
            PrintBinary(n-1,1,str+"1");
        }

    }
    public static void main(String args[]) {
        PrintBinary(2,0,"");
    }
    
}
