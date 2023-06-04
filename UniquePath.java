import java.util.*;


public class UniquePath {

    static int count(int i,int j,int[][]dp){
        if(i==0 || j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = count(i-1,j,dp);
        int left = count(i,j-1,dp);
        return dp[i][j] = up + left;
    }

    static int unique(int m,int n){
    int dp[][] = new int[m][n];
    for(int[]row:dp){
        Arrays.fill(dp,-1);
       // System.out.println(Arrays.deepToString(dp));
    }
    return count(m-1,n-1,dp);
    } 

    public static void main(String[] args) {
        int m=2;
        int n =2;
        System.out.println(unique(m,n));

    }
    
}
