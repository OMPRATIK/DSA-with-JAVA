/*Given an integer array nums return true 
if any value appears twice in the array!! */

public class q1 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        System.out.print(twice(a));
        
    }
    public static boolean twice(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }return false;
    }
}
 
