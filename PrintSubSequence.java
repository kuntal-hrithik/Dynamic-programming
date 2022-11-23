import java.util.ArrayList;

public class PrintSubSequence {
    static void print(int i,ArrayList<Integer>sub,int arr[]){
        if(i==arr.length-1){
            System.out.println(sub);
        }
        sub.add(arr[i]);
        print(i+1,sub,arr);
        sub.remove(sub.size()-1);
        print(i+1,sub,arr);

    }
    public static void main(String[] args) {
     int arr[] = {3,1,2};
     //int n=3;
     ArrayList<Integer> sub = new ArrayList<>();
     print(0,sub ,arr);   
    }
    
}
