public class towerOfHanoi {
    public static void towerHanoi(int n,String src,String he,String des) {
        if(n==1) {
            System.out.println("Transfer "+n+" disk from "+src+" to "+des);
            return;
        }
        towerHanoi(n-1, src, des, he);
        System.out.println("Transfer "+n+" disk from "+src+" to "+des);
        towerHanoi(n-1, he, src, des);
        
    }
    public static void main(String[] args) {
        int n = 3;
        towerHanoi(n,"A","B","C");
    }
}
