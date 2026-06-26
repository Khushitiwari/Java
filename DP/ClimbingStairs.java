public class ClimbingStairs {

    // count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time

    // recursion
    public static int countWays(int  n){
        if( n == 0 ) return 1;
        if( n <0 ) return 0;


       return  countWays( n-1) + countWays( n-2);

    }

    // Memoization
    public static int memo( int n  , int[] ways ){
        if( n == 0) return 1;
        if( n <0) return 0;

        if( ways[n] != -1 ){ // already kiya h calculate vaha se lelo
            return ways[n];
        }
         ways[n] = memo(n-1 , ways) + memo(n-2 , ways);
        return ways[n];

    }

    public static int tabulation1(int n) {
    if (n == 0) return 1;

    int[] dp = new int[n + 1];

    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
}

    // to climb either 1 , 2 or 3 stairs

    public static int tabulation(int n) {

    if (n == 0) return 1;
    if (n == 1) return 1;
    if (n == 2) return 2;

    int[] dp = new int[n + 1];

    dp[0] = 1;
    dp[1] = 1;
    dp[2] = 2;

    for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }

    return dp[n];
}
    
    public static void main(String[] args) {
        
      int n = 5;
      // System.out.println(countWays(n));


     int[] ways = new int[n+1];
    // Arrays.fill(ways, -1);
    // System.out.println(memo(n , ways));
     System.out.println(tabulation(n));

    }
}
