public class hello{
    static int f(int i, int j){
        if(i==0||j==0){
            return 1;
        }
        if(i<0||j<0){
            return 0;
        }
        int up = f(i-1,j);
        int left = f(i,j-1);
        System.out.println(left);
        return up + left;
    }
    public static void main(String[] args) {
        int m=2;
        int n=2;
        System.out.println(f(m-1,n-1));
    }
}