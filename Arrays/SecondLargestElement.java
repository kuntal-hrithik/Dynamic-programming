package Arrays;

public class SecondLargestElement {
    static void f(int arr[],int n){
        // int largest = arr[0];
        // for(int i=0;i<n;i++){
        //     if(arr[i]>largest){
        //         largest = arr[i];
        //     }
        // }
        // int secondLargest = -1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>secondLargest && arr[i] != largest){
        //         secondLargest = arr[i];
        //     }
        // }
        // System.out.println(secondLargest);

        //more optimized solution

        int largest = arr[0];
        int secondLargest  = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>=largest){
                secondLargest = largest;
                largest=arr[i];   
            }else{
                secondLargest=arr[i];
            }

        }
        System.out.println(secondLargest);

    }
public static void main(String[] args) {
    int arr[] = {1,2,4,7,7,5};
    int  n =arr.length;
    f(arr,n);
}    
}
