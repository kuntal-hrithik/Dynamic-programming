import java.util.*;
public class example {

    static int f(int arr[],int n){
        if(n==0){
            return arr[n];
        }
        if(n<0){
            return 0;
        }
        int pick = arr[n] + f(arr,n-2);
        int notPick = 0 + f(arr,n-1);
        return Math.max(pick,notPick);
    }
    public static void main(String[] args) {
        int arr[] ={1,3,4,5,7};
        int n = arr.length;
        System.out.println(n);
        System.out.println(f(arr,n-1));
    }
}
