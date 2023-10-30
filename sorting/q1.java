public class q1{
    public static void main(String args[]){
        int a[]= {3,6,2,1,8,7,4,5,3,1};
        count(a); 
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    // BUBBLE SORT
    public static void bubble(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]<a[j+1]){
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    // SELECTION SORT
    public static void selection(int a[]){
        for(int i=0;i<a.length-1;i++){
            int maxPos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[maxPos]<a[j]){
                    maxPos=j;
                }               
            }int temp=a[i];
            a[i]= a[maxPos];
            a[maxPos]=temp;
        }
    }
    // INSERTION SORT
    public static void insert(int a[]){
        for(int i=1;i<a.length;i++){
            int temp = a[i];
            int j=i-1;
            while(j>=0 && a[j]<temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
    // COUNTING SORT
    public static void count(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max= Math.max(a[i],max);
        }
        int count[] = new int[max+1];
        for(int i=0;i<a.length;i++){
             count[a[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }

}