public class kthLargest {
    public static int kthElem(int L,int R,int K) {
        int cnt = 0;
        for(int i=L;i<=R;i++) {
            if(Math.abs(i)%2==1) {
                cnt++;
            }
            if(cnt == K) return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int L = -3;
        int R = 3;
        int K = 1;
        System.out.println(kthElem(L, R, K));
    }
}
