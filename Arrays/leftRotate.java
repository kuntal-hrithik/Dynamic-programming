package Arrays;

public class leftRotate {

    static void r(int arr[],int k){
       while(k>=1){
        int i=0;
        int temp = arr[i];
        for(int j=1;j<arr.length;j++){
            arr[j-1] = arr[j];
        }
        arr[arr.length-1] = temp;
        i++; 
        k--;
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
       }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k=2;
        r(arr,k);
    }
}
