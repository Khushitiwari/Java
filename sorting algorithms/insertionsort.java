import java.util.*;

public class insertionsort{

    public static void insertionSort(int arr[]){ // time complexity O(n)

        for(int i = 1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev +1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;

        }

    }

     public static void printArr(int arr[]){
      for(int i = 0 ;  i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }

      System.out.println();
    }

    public static void main(String args[]){

        int arr[] = {3, 2, 6, 4,1,5};
       // Arrays.sort(arr);
          Arrays.sort(arr,0,3); // ending index non inclusive
        printArr(arr);

      


    }
}