
public class Questions {
    public static void findSubsets(String str , String ans, int i){
        //base case 
        if(i == str.length()){
            if(ans.length() == 0 ){
                System.out.println("null");
               
            }else {
            System.out.println(ans);
           
            }
             return;
        }


        // recursion 
        //yes choice
        findSubsets(str , ans+str.charAt(i) , i+1);

        //No choice
        findSubsets(str , ans , i+1);


    }

    public static void findPermutations( String str , String ans){
     //base case
     if(str.length() == 0){
        System.out.println(ans);
        return;
     }

     //recursion T.C = O(n*n!)
     for(int i = 0 ; i <str.length() ; i++){
        char curr = str.charAt(i);
        String Newstr = str.substring(0 , i) + str.substring(i+1);
        findPermutations(Newstr , ans+curr);

     }




    }


    public static void main(String args[]){
    //    String str = "abc";
    //    findSubsets(str ,"" , 0);

         String str = "abcd";
         findPermutations(str , "");
    }
}