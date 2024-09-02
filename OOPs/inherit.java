public class inherit {
    public static void main(String args[]){
        human pratik = new human();
        pratik.eat();
        pratik.dances();
    }   
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void walk(){
        System.out.println("walks");
    }
}
class human extends Animal {
    void dances(){
        System.out.println("dances");
    }

}
