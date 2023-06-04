import java.util.*;
public class MaxFallingPath {
    
    static int f(int i,int j,int arr[][]){
        // int [][]
        if(j<0||j>=arr[0].length){
            return Integer.MIN_VALUE;
        }
        if(i==0){
            return arr[0][j];
        }
        int up = arr[i][j] + f(i-1,j,arr);
        int rd = arr[i][j] + f(i-1,j+1,arr);
        int ld = arr[i][j] + f(i-1,j-1,arr);
        return Math.max(up,Math.max(rd,ld));
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
        int n = arr.length;
        int m= arr[0].length;
        System.out.println(m);
        int maxi = Integer.MIN_VALUE;
        for(int j=0;j<m;j++){
                maxi = Math.max(maxi,f(n-1,j,arr));
            }
            System.out.println(maxi);
    }
    
    
}