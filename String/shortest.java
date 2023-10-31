// Given the direction find shortest displacement
public class shortest {
    public static void main(String args[]){
        String path= "WNEENESENNN";
        System.out.print(path(path));
    }
    public static float path(String a){
        int x =0 , y=0;
        for(int i=0;i<a.length();i++){
            char dir=a.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    
}
