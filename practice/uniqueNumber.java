public class uniqueNumber {
    public static void main(String[] args) {
        int arr[] = {2,2,1,5,5,6,6};
        int j = 0;
        for(int i=0;i<arr.length;i++) {
            j =j ^ arr[i];
        }
        System.out.println(j);
    }
}
