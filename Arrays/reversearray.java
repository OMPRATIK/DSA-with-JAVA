// reverse an array!

public class reversearray {
    public static void reverse(int numbers[]){
        int first =0, last= numbers.length-1;

        while(first < last){
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;
        first++;
        last--;
        }
    }

    public static void main(String args[]){
        int a[]={2,3,4,5,6,7,89,10};
        
        reverse(a);
        for(int i=0 ; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
