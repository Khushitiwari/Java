import java.util.*;
public class index{

  // second largest element in array T.C = O(n)
    // public static int secondLargest(int arr[] , int n){
    //     int largest = -1;
    //     int slargest = Integer.MAX_VALUE;

    //     for(int i = 0 ; i <n ; i++){
    //         if(arr[i] > largest ){
    //             slargest = largest;
    //             largest = arr[i];


    //         }else if( arr[i] < largest && arr[i] > slargest){
    //               slargest = arr[i];
    //         }
            
    //     }
    //     return slargest;
    // }



    // check if array is sorted or not

    // public static boolean checkSorted(int arr[]){

    //     for(int i = 1 ; i< arr.length ; i++){
    //        if(arr[i] >= arr[i-1]){

    //        }else{
    //         return false;
    //        }
    //     }

    //     return true;

    // }

    //remove dupicates from a sorted array
    public static int removeDuplicates(int nums[]){
         
        int j = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[j] != nums[i]){
                nums[++j] = nums[i];
            }
        }

       // return ++j;
       return j+1;
    }

   

    public static void main(String args[]){

        int arr[] = {1,1,2,2,2,3,3,4,};
        // System.out.println(checkSorted(arr));
        // int ans = secondLargest(arr , 4);
        // System.out.println ("second largest element is: " + ans);

        System.out.println(removeDuplicates(arr));

    }
}