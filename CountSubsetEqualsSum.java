public class CountSubsetEqualsSum {

    static int f(int i,int sum,int arr[]){
        if(sum==0){
            return 1;
        }
        if(i==0){
            if(arr[i]==sum)
            {
                return 1;
            }
            return 0;
        }
        int notTake = f(i-1,sum,arr);
        //System.out.println(notTake);
        int take = 0;
        if(sum>arr[i]){
            take = f(i-1,sum-arr[i],arr);
        }
        //System.out.println(take);
        return (take + notTake);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        int sum =3;
        int n = arr.length;
        System.out.println(f(n-1,sum,arr));
    }
}
