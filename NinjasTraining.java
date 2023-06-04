import java.util.*;
public class NinjasTraining {

    static int f(int day, int last, int [][]points, int[][]dp){
        if(dp[day][last] != -1){
            return dp[day][last];
        }
        if(day == 0){
            int maxi=0;
            for(int i=0;i<=2;i++){
                if(i != last){
                    maxi = Math.max(maxi,points[0][i]);
                }
            }
        }
        int maxi=0;
        for(int i=0;i<=2;i++){
            if(i != last){
                int point = points[day][i] + f(day-1, i ,points,dp);
                maxi = Math.max(maxi,point);
            }
        }
        return dp[day][last] = maxi;
    }

    static int training(int n, int[][]points){
        int [][]dp = new int[n][4];
        for(int[] row:dp){
            Arrays.fill(dp,-1);
        }
        return f(n-1,3,points,dp);
    }
    public static void main(String[] args) {
        int [][]points = {{10,40,70},{20,50,80},{30,60,90}};
        int n = points.length;
        System.out.println(training(n, points));
    }
    
}
