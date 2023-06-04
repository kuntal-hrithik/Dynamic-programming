package Arrays;

public class LargestElement {

    static void f(int arr[],int n){
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,2};
        int n=arr.length;
        f(arr,n);
    }
}
