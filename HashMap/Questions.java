import java.util.*;
public class Questions {
    
    public static void main(String[] args) {
        
        // Given an integer array , find all the elements taht appear more than n/3 times


        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] arr = {1,2,3,1,1,1,3,3,3};

        for(int i = 0 ; i < arr.length; i++){

            // if(hm.containsKey(arr[i])){
            //     hm.put(arr[i] , hm.get(arr[i]+1));
            // }else{
            //     hm.put(arr[i] , 1);
            // } or below code is better and more efficient
            
            // getOrDefault is used to get the value of a key if it exists, otherwise it returns a default value (in this case, 0)
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }


        /*  Set<Integer> keySet = hm.keySet();
         for(Integer key : keySet ){
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
         } */

        for(Integer key : hm.keySet()){
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
        }




    }
}
