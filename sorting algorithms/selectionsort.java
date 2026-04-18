
import java.util.*;

public class selectionsort{

    public static void selectionSort(int arr[]){ // time complexity O(n^2)
       
       for(int i = 0; i <arr.length-1 ; i++){
        int minPosition = i ;// to finding index of smallest element and put it in the starting
          for(int j = i+1 ; j<arr.length ; j++){
            if(arr[minPosition] > arr[j]){ // for decreasing order  arr[minPosition] < arr[j]
                minPosition = j;
            }
          }

          // swap
          int temp = arr[minPosition];
          arr[minPosition] = arr[i];

          arr[i] = temp;
          
       }
 
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
        selectionSort(arr);
        printArr(arr);
     }
}