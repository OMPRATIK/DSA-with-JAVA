public class second_occur {
    public static int secondOccur(int arr[],int i,int key) {
        if(i==arr.length) {
            return -1;
        }
        int found = secondOccur(arr, i+1,key);
        if(found == -1 && arr[i] == key) {
            return i;
        }
        return found;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,6,7,2};
    }
}
