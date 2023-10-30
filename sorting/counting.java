public class counting {
    public static void main(String args[]){
        int a[]={1,4,1,3,2,4,3,7};
        count(a);
    }
    public static void count(int a[]){
        // largest element to create new array largest+1
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest = Math.max(largest,a[i]);
        }
        // new array to count frequency of element
        int count[]= new int[largest+1];
        for(int i=0; i< a.length;i++){
            count[a[i]]++;
        }
        int j=0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
