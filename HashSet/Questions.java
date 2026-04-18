import java.util.*;

public class Questions {
    
    // public static void main(String[] args) {
        
    //     int arr1[] = { 7,3, 9};
    //     int arr2[] = { 6, 3, 9 ,4 , 2} ;

    //     HashSet<Integer> set = new HashSet<>();

    //     //union
    //     for( int i = 0 ; i<arr1.length ;i++ ){
    //          set.add(arr1[i]);
    //     }


    //     for( int i = 0 ; i< arr2.length ; i++){
    //        set.add(arr2[i]);
    //     }

    //     for( int el : set){
    //         System.out.println(el);
    //     }

    //     System.out.println("union = " +set.size());

    //      // intersection 
    //      set.clear();
    //     for( int i = 0 ; i< arr1.length; i++){
    //         set.add(arr1[i]);
    //     }
        
    //     int count = 0;
    //     for( int i= 0 ; i <arr2.length ; i++){
    //         if(set.contains(arr2[i])){
    //           count++;
    //           System.out.println(arr2[i]);
    //           set.remove(arr2[i]);
    //         }
    //     }

         

      
    //     System.out.println("intersection "  +count);
       

    // }



      // Find itinery from tickets

   /* 
        public static String getStart( HashMap<String , String> tickets){
          HashMap<String , String > revMap = new HashMap<>();

          for( String key : tickets.keySet()){
             revMap.put( tickets.get(key) , key); // value , key passed in reverse one
          }

          for( String key : tickets.keySet()){
             if( !revMap.containsKey(key)){
                return key; // starting point
             }
          }

          return null;
        }
       public static void main(String[] args) {  // O(n)
        
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("chennai" , "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");
       
     
     
        String start = getStart(tickets);

        System.out.print(start);

        for( String key : tickets.keySet()){
            System.out.print("-->" + tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println();
     

       }
       
       */


       // longest subarray with sum 0


       /* 
       public static void main(String args[]){ // O(n)

         int arr[] = { 15 , -2 , 2 , 1, 7 ,10 ,23};

         HashMap<Integer , Integer > hm = new HashMap<>();

         int sum = 0 ;
         int len = 0;
         for( int j = 0 ; j < arr.length ;j++){
            sum += arr[j];

            if( hm.containsKey(sum)){
                len = Math.max(len , j-hm.get(sum));
            }else{
               hm.put(sum , j);
            }
         }
           


         System.out.println("length " +len);
       }

       */

     

      // subarray sum equal to 0

}
