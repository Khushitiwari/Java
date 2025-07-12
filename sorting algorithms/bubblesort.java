
import java.util.*;

public class bubblesort{

    public static void bubbleSort(int arr[]){ // time complexity O(n^2)

        int totalSwaps = 0; // if wanted to count totalSwaps done
        for(int turn = 0; turn<arr.length-1; turn++){
            int swaps = 0; // to make TC O(n) when array is already sorted

           
            for(int j = 0 ; j < arr.length-1 -turn ; j++){
                if(arr[j] > arr[j + 1]) { // for sorting in decreasing order arr[j] < arr[j +1]
                    // swapping arr[j] and arr[j + 1]
                    int temp =arr[j] ;

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                    swaps++;
                    totalSwaps++;


                }

            }

            if(swaps == 0){ // termination if no swap
            System.out.println("Already sorted");
               break;
            }

        }
        System.out.println("Total Swaps done: " + totalSwaps);
    }

    public static void printArr(int arr[]){
      for(int i = 0 ;  i <arr.length; i++){
        System.out.print(arr[i] + " ");
      }

      System.out.println();
    }
     
     public static void main(String args[]){
        // int arr[] = {1,2, 3, 4, 5};
        int arr[] = {3, 5, 8, 3, 2, 1};
        bubbleSort(arr);
        printArr(arr);
     }
}