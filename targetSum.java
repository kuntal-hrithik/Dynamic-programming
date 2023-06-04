import java.io.*;
import java.util.Arrays;
public class targetSum {

    static int f(int ind,int k,int arr[]){
        if(ind==0){
            
        }
    }

    static int findWays(int arr[],int k){
        int n = arr.length - 1;
        int dp[][] = new int[n][k+1];
        for(int[]row:dp){
            Arrays.fill(row, -1);
        }
       int sum= f(n-1,k,arr);
       return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int k = 3;
        System.out.println(findWays(arr,k));
    }
}
