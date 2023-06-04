public class SubsetEqualaTarget {

    static boolean f(int arr[],int i,int target){
        if(target==0){
            return true;
        }
        if(i==0){
            return (arr[0] == target);
        }
        boolean notTake = f(arr,i-1,target);
        boolean take = false;
        if(target>=arr[i]){
            take = f(arr,i-1,target-arr[i]);
        }
        return notTake || take;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1};
        int n = arr.length;
        int target = 10;
        System.out.println(f(arr,n-1,target));
    }
}
