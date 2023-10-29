public class condition {
    public static void main(String args[]){
        int age = 21;
        if(age>=18){
            System.out.print("adult : drive, vote");
        }
        else if(age>13 && age<18){
            System.out.print("Teenagers");
        }

        else{
            System.out.print("not an adult");
        }
    }
    
}
