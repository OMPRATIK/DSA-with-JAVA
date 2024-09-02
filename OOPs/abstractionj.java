public class abstractionj {
    public static void main(String args[]){
        Ghoda g = new Ghoda();
        g.eat();
        g.walk();
    }
}

abstract class Janwar{
     void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Ghoda extends Janwar{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
