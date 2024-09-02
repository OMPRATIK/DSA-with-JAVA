public class Define{
    public static void main(String args[]){
        // Created a pen object called p1
        Pen p1 = new Pen();
        p1.setColor("blue");
        p1.setTip(24);

        System.out.println(p1.getColor()); //getters
        System.out.println(p1.tip);
    }
}
class Pen {
    // Attributes
private String color;
 int tip;
    // Functions
String getColor(){ // getters
    return this.color;
}
void setColor(String newColor){ // setters
    color = newColor;
}

void setTip(int newTip){
    tip = newTip;
}
}