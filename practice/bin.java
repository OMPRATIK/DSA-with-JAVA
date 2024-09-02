public class bin {
    public static void main(String args[]){
        int a[] = {2,3,4,5,6,7,8,9,10};
        int key = 4;
        System.out.print(bin(a,key));
    }

    public static int bin(int num[], int key){
        int first = 0;
        int last = num.length-1;

        while(first<=last){
            int mid = (first + last)/2;
            if(num[mid]==key){
               return mid;
            }
            else if(num[mid]>key){
                last = mid-1;               
            }
            else if(num[mid]<key){
                first = mid+1;              
            }
            
    }return -1;
    
}
}
