/* Quick sort is a divide-and-conquer algorithm that sorts an array by 
selecting a 'pivot' element and partitioning the other elements into two sub-arrays according to whether 
they are less than or greater than the pivot. The sub-arrays are then sorted recursively. */
//NOTE : watch worst case video in quick sort lec 

public class quick{
   

   public static void printArr(int arr[]){
      for(int i = 0 ; i <arr.length; i++){
          
            System.out.print(arr[i] + " ");
          }

          System.out.println();
      
      
   }

   public static void quickSort(int arr[] , int si , int ei){

    // base case
    if( si >= ei){
        return;
    }
      // pivot = last element

      //partition
      int pidx = partition(arr ,si , ei);

      quickSort(arr , si , pidx-1); //left 
      quickSort(arr , pidx+1 , ei); // right 

   }

   public static int partition(int arr[] ,int si , int ei){
    int  pivot = arr[ei];
    int i = si -1 ; // i is the iterator which makes spaces for elements less then pivot element


    for(int j = si ; j < ei; j++){
        if(arr[j] <= pivot){
            // swapping
            i++; 

            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }

    }

     // to place the pivot at the right place

     i++;
     int temp = pivot;
     arr[ei] = arr[i];
     arr[i] = temp;

     return i;



   }

    public static void main(String args[]){
        int arr[] = {6,3,9 ,8 , 2,5};
        quickSort(arr , 0 , arr.length-1);
        printArr(arr);



    }
}