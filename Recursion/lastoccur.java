// check the last occurence of an element in an array

public class lastoccur {
    public static int lastoccur(int a[],int key,int i) {
        if(i==a.length) {
            return -1;
        }
        int found = lastoccur(a,key,i+1);
        if(found==-1 && key==a[i]) {
            return i;
        }
        return found;
    }
    public static void main(String args[]){
        int a[]={2,3,4,5,6,6,4,2,3,4};
       System.out.print( lastoccur(a,4,0));
    }   
}
