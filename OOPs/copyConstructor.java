public class copyConstructor {
    public static void main(String args[]){     
        
        Student s1 = new Student();
        s1.name="pratik";
        s1.roll =73;
        s1.marks[0]=23;
        s1.marks[1]=77;

        Student s2 =new Student(s1);
        s1.marks[0]=100;
        for(int i=0;i<2;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
    
}

class Student{
    String name;
    int roll;
    int marks[];

    Student(){
        marks =new int[2];
    }
    Student(Student s1){
        marks = new int[2];
        this.name =s1.name;
        this.roll =s1.roll;

        for(int i=0;i<2;i++){
            this.marks[i]= s1.marks[i];
        }
    }
    
}