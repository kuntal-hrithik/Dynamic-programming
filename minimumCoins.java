import java.util.Arrays;

public class minimumCoins {

    static int f(int arr[],int i,int target){

        
        if(i == 0){
            if(target % arr[0]==0){
                return target/arr[0];
            }else{
                return Integer.MAX_VALUE;
            }
        }
        int notTake = 0 + f(arr,i-1,target);
        int take = Integer.MAX_VALUE;
        if(arr[i]<=target){
            take = 1 + f(arr,i,target-arr[i]);
        }
        return Math.min(take,notTake);
    }

    static int minimumElements(int arr[],int target){
        int n = arr.length;
        int [][] dp = new int[n][target+1];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }

        int ans = f(arr, n-1, target);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,6,5};
        int target = 11;
        System.out.println(minimumElements(arr,target));
    }
}
