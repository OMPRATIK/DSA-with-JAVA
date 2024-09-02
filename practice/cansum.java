public class cansum {
    public static boolean findSum(int arr[],int sum,int i,int temp) {
        if(temp == sum) return true;
        if(i == arr.length) return false;
        boolean ans1 = findSum(arr, sum, i+1, temp+arr[i]);
        
        boolean ans2 = findSum(arr, sum, i+1, temp);
        return ans1 || ans2;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,11};
        int sum = 10;
        System.out.println(findSum(arr, sum, 0, 0));
    }
}
