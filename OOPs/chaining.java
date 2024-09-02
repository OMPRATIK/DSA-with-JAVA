class cat  {
    static {
        System.out.println("hi");
    }
    {
        System.out.println("helo");
    }   
}

public class chaining {   
    public static void main(String[] args) {
        new cat();
        System.out.println("bye");
    }
}

