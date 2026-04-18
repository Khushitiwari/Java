import java.util.*;
public class questions{

    // Tilling problem
    /* Given a " 2 * n floor and tiles of size 2*1 , count the number of ways to tile the given floor using the 2*1 tiles. tiles
    can be placed horizontally or vertically */

    public static int tilingProblem(int n ){ // 2 * n  (floor size)

    //base case
    if (n == 0 || n == 1){
        return 1;
    }

    // // vertical choice
    // int fnm1 = tilingProblem(n -1);
    
    // // horizontal choice 


    // int fnm2 = tilingProblem(n -2);

    // int totalWays = fnm1 + fnm2 ;
    // return totalWays;

     // making the whole fn in one line(except base case) shorter :)
     return tilingProblem(n-1) + tilingProblem(n -2);

    }

    // removing duplicates characters from the string(do stack analysis)
    public static void removeDuplicates(String str , int idx ,  StringBuilder newStr , boolean map[]){
        if( idx == str.length()){
            System.out.println(newStr);
            return;

        }

        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true){
            removeDuplicates(str , idx + 1 , newStr , map);

            

        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str , idx + 1 , newStr.append(currChar) , map);
        }

    }


    /* Question: 
    Given n friends , each one can remain single or can be paired up with some other friend. Each friend can be paired only once. 
    Find out the total number of ways in which friends can remain single or can be paired up.
    do stack analysis by yourself
    */ 


    public static int friendsPairing(int n){
        //base case
        if(n == 1 || n ==2){
            return n;
        }

        // //choice
        // //stay single choice
        // int fnm1 = friendsPairing(n - 1);

        // //pair choice
        // int fnm2 = friendsPairing(n -2);
        // int pairWays = (n -1) * fnm2;

        // //totalWays
        // int totalWays = fnm1 + pairWays;

        // return totalWays;

        // making the whole fn in one line(except base case) shorter :)

        return friendsPairing(n - 1) + (n-1) * friendsPairing(n - 2);


    }

    /* Binary sring problem
    Print all binary strings of size N without consecutive ones

    */
    public static void printBinStringss(int n , int lastPlace, String str ){

        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }


        // if(lastPlace == 0){
        //     printBinStringss(n-1 , 0 , str.append("0"));
        //     printBinStringss(n-1 , 1, str.append("1"));

        // }else{
        //     printBinStringss(n-1 , 0 , str.append("0"));
        // }
        
         printBinStringss(n-1 , 0 , str+ "0" );
         if( lastPlace == 0){
              printBinStringss(n-1 , 1, str + "1");

         }

    }





    public static void main(String args[]){

        //System.out.println(tilingProblem(4));
       //String str =  "hellokhushi";
      //removeDuplicates(str , 0 , new StringBuilder("") ,  new boolean[26]);
     //System.out.println(friendsPairing(3));
     //System.out.println(tilingProblem(1));
       printBinStringss( 3 , 0 , "");



    }
}