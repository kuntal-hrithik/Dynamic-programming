import java.util.*;
public class MaxNonAdjacentSum{

    static int max(int ind,int arr[],int dp[]){
        if(dp[ind] != -1){
            return dp[ind];}
            if(ind == 0){
                return arr[ind];
            }
            if(ind < 0){
                return 0;
            }
            int pick = arr[ind] + arr[ind - 2];
            int notPick = 0 + arr[ind - 1];
            return dp[ind] = Math.max(pick,notPick);

        }

    static int solve(int n,int arr[]){
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return max(n-1,arr,dp);


    }
    public static void main(String[] args) {
        int arr[]={2,1,4,9};
        int n=arr.length;
        System.out.println(solve(n,arr));
    }
}