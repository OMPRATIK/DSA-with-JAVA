public class linear {
    public static void main(String args[]){
        int a[]= {2,3,5,7,8,9,90,5,4,13,23,122};
        System.out.print(linear(a,123));
        
    }
    public static int linear(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }return -1;
    }
    
}
