public class creation {
    public static void main(String args[]) {
        Pen1 p = new Pen1();
        p.setcolor1("orange");

       System.out.print(p.getcolor1());
    }    
}
class Pen1 {
    private String color1;

String getcolor1() {
    return this.color1;
    }
void setcolor1(String newcolor) {
    this.color1 = newcolor;
    }
}
