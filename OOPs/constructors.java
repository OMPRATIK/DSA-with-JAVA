public class constructors {
    public static void main(String args[]){
        Apple s1 = new Apple("Pratik");
        System.out.println(s1);
            
    }
}

class Apple{
    String name;
    int roll; 
    // non parameterized
    Apple() {
    }
    // parameterized
    Apple(String name) {
        this.name = name;
    }
}