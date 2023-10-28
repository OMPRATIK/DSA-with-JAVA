// Pairs in an array

public class pairs {

    public static void pairs(int numbers[]){
        int no_pairs=0;
        
        for(int i=0; i<numbers.length;i++){
           
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                no_pairs++;
            }System.out.println();
            
        }
        System.out.print("Total nmber of pairs are:"+no_pairs);        
    }

    public static void main(String args[]){
        int a[]={2,3,4,5,6};
        pairs(a);


    }
    
}
