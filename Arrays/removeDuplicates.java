package Arrays;

public class removeDuplicates {

    static void r(int arr[]){
        int i=0;
        int n = arr.length;
        for(int j=1;j<n;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("unique elements are" + " " + (i+1));
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        r(arr);
    }
}
