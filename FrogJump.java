import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class FrogJump {
    static int jump(int i,int[]height,int[]dp){
        if(i==0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int left = jump(i-1,height,dp) + Math.abs(height[i] - height[i-1]);
        int right = Integer.MAX_VALUE;
        if(i>1){
            right = jump(i-2,height,dp) + Math.abs(height[i] - height[i-2]);
        }
        return dp[i]=(Math.min(left, right));

    }

      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   int arr[] = new int[n];
   for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
   }
   int dp[]=new int[arr.length];
   Arrays.fill(dp,-1);
   System.out.println(jump(n-1,arr,dp));

    }
}
