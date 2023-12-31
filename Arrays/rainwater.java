// Traping rain warter

public class rainwater {
    public static void main(String args[]){
        int height[]= {4,2,0,6,3,2,5};
        System.out.print(rain(height));   
    }
    public static int rain(int height[]){
        int n = height.length;
        //calculate left max boundary-array
        int LeftMax[]= new int[height.length];
        LeftMax[0] = height[0];
        for(int i =1; i< height.length; i++){
            LeftMax[i]= Math.max(height[i],LeftMax[i-1]);
        }
        //calculate right max boundary-array
        int RightMax[]= new int[height.length];
        RightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0 ; i--){
            RightMax[i]= Math.max(height[i], RightMax[i+1]);
        }
        int trappedwater=0;
         //loop
         for(int i =0 ; i<n; i++){
            //water level = min(left max ,right nmax)
            int trappedlevel= Math.min(LeftMax[i],RightMax[i]);
            // trapped water = water lvl - height[i]
            trappedwater+= trappedlevel - height[i];
         }
         return trappedwater;       
    }    
}
