/* merge sort is a divide and conquer algorithm that sorts an array by dividing it into two halves, 
then recursively sorting each half, and finally merging the sorted halves back together.
 It is a stable sort and works well for large datasets. 
 The time complexity is O(n log n) in all cases (best, average, and worst), 
 and the space complexity is O(n) due to the temporary arrays used during the merge process.

merge sort descending order T.C = nlogn ; S.C = O(n)
 this recursion process is known as depth first */
 
public class index{

    public static void printArr(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort( int arr[] , int si ,  int ei){

        //base case
        if(si >= ei){
            return;
        }

       // kaam
       int mid = si + ( ei - si)/2 ;
       
       mergeSort(arr ,si ,  mid); // left part
      
       mergeSort(arr , mid + 1 , ei); //right part

       merge(arr , si , mid , ei);
    }

    public static void merge(int arr[] , int si , int mid , int ei){
        int temp[]  = new int[ei - si + 1]; // as array index is 0 based so +1
        int i = si ; // iterator for left part
        int j = mid + 1 ; // iterator for right part
        int k = k = 0; // iterator for temporary part

        while( i <= mid && j <= ei){

            if( arr[i] < arr[j]){
                temp[k] = arr[i];
                i++ ; 
            }else{
                temp[k] = arr[j];
                j++ ; 
            }
            k++;
        }

        // if some value is remaining in the left part
        while(i <= mid ){
            temp[k++] = arr[i++];
        }

        // if some value is remaining in the right part
         while(j <= ei){
            temp[k++] = arr[j++];
        }
  

       // copy temp to original arr
       for(k = 0 , i = si ; k < temp.length ; k++ , i++){
          arr[i]=  temp[k];
       }

    }
    

    public static void main(String args[]){
        int arr[] = { 6, 3, 9, 5, 2, 8};
        mergeSort(arr , 0 , arr.length-1);
        printArr(arr);
    }
}