public class binary {
    public static int binary(int numbers[], int key){
        int start=0 , end = numbers.length-1;
        
        while(start<=end){
        int mid = (start+end)/2;

        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] < key){
            start = mid+1;

        }
        else{
            end =mid -1;
        }
        }return -1; 

    }
    public static void main(String args[]){
        int a[]={2};
        int key = 2;
        binary(a,key);
        System.out.print("index for key is :"+binary(a,key));

    }
    
}
