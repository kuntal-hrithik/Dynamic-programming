class ClimbingStairs {
    static int count(int n){
        if(n==0||n==1){
            return 1;
        }
        int right=count(n-1);
        int left = count(n-2);
        return left + right;
    }
    public static void main(String[] args) {
        //System.out.println("hello");
        int n=3;
        System.out.println("there are "+count(n) + " ways to reach final stair");
        
    }
}