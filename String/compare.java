// compare Strings 
// compareTo function checks the lexicographic order
public class compare {
    public static void main(String args[]){
        String a[] = {"apple", "banana", "mango"};
        compare(a);
    }
    public static void compare(String a[]){
        String largest = a[0];
        for( int i =1; i<a.length;i++){
            if( largest.compareTo(a[i])<0){
                largest = a[i];
            }
            
        }System.out.print(largest);
    }
}
