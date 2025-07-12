import java.util.*;



public class binarySearch{

    //binary search 

   public static int binary(int numbers[] , int key ){
      int start = 0 , end = numbers.length - 1 ;

      while(start<= end ){
         int mid = (start + end)/2;
        

         //comparisons

         if(numbers[mid] == key ){
            return mid ;

         }
         if(numbers[mid]< key ){// right
            start = mid + 1;
         }else{ //left
            end = mid -1;
         }

      }
      return -1;

   }

       public static void main(String args[]){
         int nums[] ={2,4,6, 8,10,12,16,18,20};
         int key = 18 ;
         System.out.println("Index for key is " + binary(nums,key));
       }


}