public class Super {

    public static void main(String[] args) {
        Insaan i = new Insaan();
        Insaan2 i2 = new Insaan2();
        Janwar1 j1 = new Janwar1();
        System.out.println(i2.limbs);
    }
}
class Janwar1 {
    int limbs;
    Janwar1() {
        System.out.println("Janwar constructor");
    }
}
class Insaan extends Janwar1{
    Insaan() {
        super();
        super.limbs = 2;
        System.out.println("Insaan constructor");
    }
}
class Insaan2 extends Insaan {
    Insaan2() {
        // By default parent class constructors used!
        System.out.println("Insaan2 constructor");
    }
}
