//Search in sorted rotated array , it like a modiefied version of binary search
// try to wriite this using iterations intead of iterations

public class search{

    public static int srchSortedRotated(int arr[] , int tar, int si , int ei){
        if(si > ei){
            return -1;
        }

        //finding the mid 
        int mid = si + (ei - si)/2 ;  //(si + ei)/2;
        
        //case found
        if(arr[mid] == tar){
            return mid;
        }
        

        //case when mid lies on line 1
        if(arr[si] <= arr[mid] ){
             // case a : left 
             if(arr[si] <= tar && tar<= arr[mid]){
                //searching recursively
                  return  srchSortedRotated(arr, tar, si , mid-1);

             }else{
                //case b: right

                return srchSortedRotated(arr , tar , mid+1 , ei);
             }
        }


        // case when mid lies on line 2
        else{
            // case c : right
            if( arr[mid] <= tar && tar <= arr[ei]){
                return srchSortedRotated(arr ,tar , mid +1 , ei );

            }else{
                // case d: left

                return srchSortedRotated(arr, tar , si , mid - 1 );
            }
        }

    }


public static void main(String args[]){
      int arr[] = { 4, 5, 6, 7, 0, 1, 2};
      int target = 0;
      int tarIdx = srchSortedRotated(arr, target , 0 , arr.length-1);
      System.out.println(tarIdx);

}


}