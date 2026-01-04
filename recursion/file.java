
public class file{
   

   //recursive fn to print in decreasing order

    public static void printDec(int n ){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);


    }

    //recursive fn to print in inecraesing order

    public static void printInc(int n){
        if( n == 1){
            System.out.print(n);
            return;
        }

        printInc(n-1);
        System.out.print(" " + n );
    }


    //factorial recursive fn  T.C = O(n) S.C = O(n)

    public static int fact(int n){

        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;

    }


  // recursive fn to find the sum of first n natural numbers

    public static int calSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = calSum(n-1);
        int sn = snm1 + n;
        return sn;
    }

    // recursive fn to check sorted array  T.C = O(n) , S.C = O(n)

    public static boolean isSorted(int arr [], int i){
        if(i == arr.length - 1){
            return true;
        }
      
       if(arr[i] > arr[i +1]){
        return false;

      }
      

      return isSorted(arr , i+1);


    }

    // recursive fn to find the first occurence of an element in an array T.C = O(n) , S.C = O(n)
    public static int firstOcc(int arr[] , int key , int i){

        if( arr.length  == i){
            return -1;
        }

        if(arr[i] == key){ 
            return i ;
        }

        return firstOcc(arr , key , i+1);
    }

     // recursive fn to find the last occurence of an element (do stack analysis)
     // T.C is O(n) 
     public static int lastOccur(int arr[] , int key , int i ){
        if( i == arr.length){
            return -1 ;
        }

        int isFound = lastOccur(arr , key , i+1); // first check forward if key exist
        if(isFound == -1 && arr[i] == key){

            return i; 
        }


        //check with self(if key does not exist forward)
        // if(arr[i] == key){
        //     return i;
        // }

        return isFound;
     }

      

      // recursive fn to print the x to the power n 
      public static int power(int x , int n){ 
        if(n == 0 ){ // base case
            return 1;
        }

        //long method
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1 ;
        // return xn;

        // short one 
        return x * power(x , n -1);
      }

     
     // recursive fn to print the x to the power n (more optimised one) try call stck anlysis
     public static int optimisedPower(int a , int n){ 

        if(n == 0 ){ // base case
            return 1;
        }

       /* int halfPOwersqr = optimisedPower(a, n/2) * optimisedPower(a, n/2);
       this will give the T.C of O(n)

       */

      
       // to make T.C O(logn)
        int halfPOwer = optimisedPower(a, n/2);
        int halfPOwersqr = halfPOwer * halfPOwer;

        // if n is odd
        if( n % 2 != 0){
            halfPOwersqr =  a * halfPOwersqr;
        }
        return halfPOwersqr ;
     }


   // main function to test the above functions
    public static void main(String args[]){
         // int n = 12;
        // printInc(n);
       // int n = 5;
      // System.out.print(calSum(n));


    //    int arr[] = {1,2,9,4,5,6};
    //    System.out.println(isSorted(arr, 0));


    //   int arr[] = {5, 7,  2, 3};

    //   System.out.println(firstOcc(arr , 3 , 0));

    //    int arr[] = {4,6, 9, 4 , 8,4};
    //      System.out.println(lastOccur(arr, 4, 0));

     // System.out.println(power(2, 10));

     System.out.println(optimisedPower(2, 10));

       


    }
}