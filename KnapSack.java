import java.util.*;
public class KnapSack{

    static int steal(int ind,int w,int[]wt,int[]val){
        if(ind==0){
            if(wt[0]<=w){
                return val[0];
            }
            else{
                return 0;
            }
        }
        int notPick = 0 + steal(ind-1,w,wt,val);
        int pick = Integer.MIN_VALUE;
        if(wt[ind]<=w){
            pick = val[ind] + steal(ind-1,w-wt[ind],wt,val); 
        }
        return Math.max(pick,notPick);
    }
    public static void main(String[] args) {
        int n = 3;
        int wt[] = {3,2,4};
        int val[] = {30,40,60};
        int w = 6;
        System.out.println(steal(n,w,wt,val));

    }
}