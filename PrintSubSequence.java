import java.util.ArrayList;

public class PrintSubSequence {
    static void print(int i,ArrayList<Integer>sub,int arr[],int n){
        if(i==n){
            System.out.println(sub);
        }
        sub.add(arr[i]);
        print(i+1,sub,arr,n);
        sub.remove(arr[i]);
        print(i+1,sub,arr,n);

    }
    public static void main(String[] args) {
     int arr[] = {3,1,2};
     int n=2;
     ArrayList<Integer> sub = new ArrayList<>();
     print(0,sub ,arr,n);   
    }
    
}
