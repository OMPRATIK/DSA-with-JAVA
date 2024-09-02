public class pairs {
    public static void main (String args[]){
        int a[]={2,3,4,5,56,7};
        pairs(a);
    }
    public static void pairs(int a[]){

        for(int i=0;i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
            }System.out.println();
        }
    }
    
}
