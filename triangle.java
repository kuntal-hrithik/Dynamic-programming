import java.util.*;
public class triangle {
    static int minimumPathSum(int i,int j,int n,int[][]arr){
        if(i==n-1){
            return arr[n-1][j];
        }
        int down = arr[i][j] + minimumPathSum(i+1, j, n, arr);
        int dg = arr[i][j] + minimumPathSum(i+1, j+1, n, arr);
        return Math.min(down,dg);
    }
    public static void main(String[] args) {
        int arr[][] = {{1},{2,3},{3,6,7},{8,9,6,10}};
        int n = arr.length;
        System.out.println(minimumPathSum(0,0,n,arr));
    }
}
