public class fibonacci {


    // memoization
    public static int fib( int n , int f[]){ // O(n) and without DP exponential T.C

        if( n == 0 || n == 1 ){
            return n;
        }

        if( f[n] !=0){ // fib(n) is already calculated
            return f[n];
        }

        f[n] = fib( n-1, f) + fib(n-2 , f); // store fin f[n] array
        return f[n];
    }


    // tabulation O(n)
    public static int fibTabulation( int n){
        int dp[] = new int[n+1];
        // initialisation
        dp[0] = 0;
        dp[1] = 1;
        // dp[i] means  fibonacci of ith number
        // filling
        for( int i = 2 ; i <= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];

        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n+1];
        System.out.println(fib(n,f));
        System.out.println(n);
    }
    
}
