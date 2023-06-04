
public class UniquePath3 {

    static int count(int i,int j,int [][]arr){
        if(i==0||j==0){
            return 1;
        }
        if(i<0||j<0){
            return 0;
        }
        int left = count(i,j-1,arr);
        int up =  count(i-1,j,arr);
        int right = count(i,j+1,arr);
        return (left+up+right);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
    int c = arr[0].length;
    int r = arr.length;
    // System.out.println(n);
    // System.out.println(m);
    System.out.println(count(r-1,c-1,arr));
    }
    
}
