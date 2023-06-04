import java.util.*;
public class MinimunPathSum {
    static int minPath(int i,int j,int arr[][]){
        if(i==0||j==0){
            return arr[0][0];
        }
        if(i<0||j<0){
            return Integer.MAX_VALUE;
        }
        int up = arr[i][j] + minPath(i-1,j,arr);
        System.out.println(up);
        int left = arr[i][j] + minPath(i,j-1,arr);
        System.out.println(left);
        return Math.min(up,left);
    }
    public static void main(String[] args) {
        int n =2;
        int m = 2;
        int arr[][] = {{1,1},{2,2}};
        System.out.println(minPath(n-1,m-1,arr));
    }
}
