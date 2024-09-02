public class bubble {
    public static void bubbleSort(int arr[]) {
        for(int i =0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  = temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,9,8,7,10,4,6};
        int a =5;
        int b = 6;
        int c = a++ ;
        System.out.println(c);
        System.out.println(a);
        
    }
}
