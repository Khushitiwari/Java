public class print{
    
     // public static void printString(String str){

        // for(int i = 0 ; i < str.length() ; i ++){
        //     System.out.prin("string at index " + i + " is " + str.charAt(i));
        // }

        // System.out.println();/

     // }


       //check if palindrome string or not
       public static boolean isPalindrome(String str ){

         for(int i = 0 ; i < str.length()/2 ; i++){

             int n = str.length();

             if( str.charAt(i) != str.charAt(n - i - 1) ) {
               // not a palindrome 
                return false;

            };

         }

         return true;
     }

    public static void main(String args[]){

          String str = "khushi";
          System.out.println(isPalindrome(str));

          // printString(str);
    }
} 