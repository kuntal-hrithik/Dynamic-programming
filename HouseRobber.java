import java.util.*;
public class HouseRobber{
    static int maxSum(ArrayList<Integer>arr){
        int n = arr.size();
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        if(dp[n] != -1){
            return dp[n];
        }
        if(n==0){
            return arr.get(n);
        }
        if(n<0){
            return 0;
        }
        int pick=arr.get(n) + arr.get(n-2);
        int notPick = 0 + arr.get(n-1);
        return dp[n] = Math.max(pick,notPick);

    }

    static int solve(ArrayList<Integer>arr,int n){
        ArrayList<Integer>arr1 = new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>();
        if(n==1){
            return arr.get(0);
        }
        for(int i=0;i<n;i++){
            if(i!=0){
                arr1.add(arr.get(i));
            }
            if(i!=n-1){
                arr2.add(arr.get(i));
            }
        }
        int ans1 = maxSum(arr1);
        int ans2 = maxSum(arr2);
        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        int n = arr.size();
        System.out.println(solve(arr,n));
    }
}