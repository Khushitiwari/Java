import java.util.*;

public class arrays{


   // linear search
    // public static   int linearSearch(String numbers[] , String key){
    //     for(int i = 0 ; i<=numbers.length ; i++){
    //         if(numbers[i] == key ){
    //             return i;
    //         }
    //     }
    //     return -1 ; // if the key is not found

    // }

    // public static void main(String args[]){
    // //   int even[] = {2,4,6,8,10, 12,14,16,18,20};
    // //   int code = 10;

    //   String menu[] = {"dosa", "chhaachh" , "poha" , "rice", "khaman" , "Samosa" , "Dhokla"};
    //   String order = "Samosa";



    //   int index = linearSearch(menu, order);
    //    if(index == -1 ){
    //     System.out.println("Not found");

    //    }
    //    else{
    //        System.out.println("Our code " + order +" is at  index " + index);
    //    }
    // }


    //largest number in array
    
    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE; //-infinity
    //     int smallest = Integer.MAX_VALUE; //+infinity

    //     for(int i = 0 ; i < numbers.length ; i++){
    //         if(  largest < numbers[i] ){
    //             largest = numbers[i];
    //         }

    //         if(numbers[i]< smallest){
    //             smallest = numbers[i];
    //         }
    //     }

    //     System.out.println("Smalles number is: " +smallest);
    //     return largest;
        
    // }
   

    // public static void main(String args[]){
    //     int data[] = {90 , 67 ,16 , 667, 404, 789 , 302, 900 , 4083};
         
    //     System.out.println("Largest number is " + getLargest(data));


    // }




    // reverse an array ( we will not using decrement as time complexity is more of that)

  //  public static void reverse(int numbers[]){ // as arrays are passed by reference so when we reverse in fn orginal will also be reversed
  //     int first = 0, last = numbers.length -1;


  //     while(first < last ){
  //       //swap 
  //       int temp = numbers[last];
  //       numbers[last] = numbers[first];
  //       numbers[first] = temp;

  //       first ++;
  //       last--;


  //     }

  //  }


    // public static void main(String args[]){
    //     int nums[] = {2,4 6,8,10,12,14,16,18,20,22,24,26,28,30};
    //     reverse(nums);



                   
    //    // to print the reversed array
    //     for(int i = 0 ; i < nums.length ; i++){
    //         System.out.print(nums[i] + " ");

    //     }
    //        System.out.println();
    // }


    // printing all possible pairs for array 
    
    // public static void printPairs(int numbers[]){
    //   int totalPairs = 0;
    //   System.out.println("All possible pairs are:");
    //   for(int i = 0; i < numbers.length;  i++){
    //     int current = numbers[i]; // 2, 4, 6, 8 , 10
    //     for(int j = i+1 ; j< numbers.length; j++){
    //       System.out.print(" (" + current  +"," + numbers[j]+ ")");
    //       totalPairs++;
    //     }

    //     System.out.println();

    //   }

    //   System.out.println("total pairs : " + totalPairs);
    // }


    // public static void main(String args[]){
    //   int nums[] = {2,4,6,8,10};
    //    printPairs(nums);

    //    //formula to calculate total  number of pairs
    //    // (n(n-1))/2
    // }


    //printing all subarrays of a array (dry run it and understand it again)

  //   public static void printSubarrays(int numbers[]){

  //     int totalPairs = 0;
  //     int sum = 0;
  //     int min= Integer.MAX_VALUE ; 
  //     int max= Integer.MIN_VALUE;

      
  //     for(int i=0 ; i< numbers.length; i++){
  //       int start = i;
  //         for(int j = i ; j<numbers.length ; j++){
  //           int end = j;
  //           sum = 0; // to reinitialise it to zero so that it will not add previous subarrays sum
  //           for(int k =start ;k<=end ; k++){
  //             System.out.print(numbers[k] + " ");
             
  //               sum += numbers[k];
  //           }
           
  //            System.out.println("Sum is: " + sum);
  //            if(sum > max){
  //             max = sum ;
  //            }
  //            if(sum < min){
  //             min = sum ;
  //            }
             
  //           totalPairs++;
  //           System.out.println();
  //         }
             
  //         System.out.println();
  //     }
  //     System.out.println("minimum value of sum is " + min);
  //     System.out.println("maximum value of sum is " + max);
  //     System.out.println("Total pairs are: " + totalPairs);
  //   }
   
  //  public static void main(String args[]){
  //   int nums []= {2,4,6,8,10};
  //   printSubarrays(nums);
  //  }
    
    /*  find the sum of each subarrays and min and maximum sum
         Above method have high time and space complexity so will use other methos for it 
    */

     

     // sum of each subarrays and min and maximum sum by Prefix sum method (Optimiseed solution)

    //  public static void maxSubarraySum(int numbers[]){
    //    int maxSum = 0 ;
    //    int sum = 0;
    //    int prefix[] = new int[numbers.length];

    //   //  int min = Integer.MAX_VALUE;
    //    int max= Integer.MIN_VALUE;

    //    //calculate prefix array
    //     prefix[0]= numbers[0]; // as first element sum is first element itself;

    //    for(int i = 1 ; i <prefix.length ; i++){ 
    //     prefix[i]= prefix[i-1] + numbers[i]; // formula to calculate prefix array elements

          

    //    }

    //    for(int i= 0 ; i <numbers.length ; i++){
    //        int start = i ;
    //        for(int j = i ;j <numbers.length ; j++){
    //         int end = j ;
            
    //         sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; // formula to calculate sum of each subarray
    //         if(sum > maxSum){
    //           maxSum = sum ;
    //         }

    //        }
    //    }

    //    System.out.println("Maximum sum is :" + maxSum);

    //  }

    //  public static void main(String args[]){
      
    //   int nums[] = {2,4,6,8,10};
    //   maxSubarraySum(nums);


  
    //  }



   

   // sum of each subarrays and min and maximum sum by Kadane's algorithm (more optimised soln)
    /*kadane's algorithm says that if the sum of subarray is negative then we will not 
    consider it(write it as 0) for further calculations as it will not give us maximum sum */

    // if all the numbers are -ve then find the max by another way

    //  public static void kadanes(int numbers[]){

      // int sum =  0; //current sum 
      // int maxSum =  Integer.MIN_VALUE; // maximun sum
      // int maxValue = Integer.MIN_VALUE;

      // for(int i = 0; i< numbers.length ; i++){
        // sum += numbers[i];

        // if(sum <0 ){
        //   sum = 0;
        // }

        // maxSum = Math.max(sum , maxSum); // fn to find max number

      //   if(numbers[i]<0){

      //     if(numbers[i]>maxValue){
      //       maxValue = numbers[i];
      //     }


      //   }

      // }

      //  System.out.println("Maximun sum is: " + maxSum);
    //    System.out.println("Maximun sum is: " + maxValue);
      
    //  }

    //  public static void main(String args[]){
    //    int nums[] = {-1,-2, -3, -4};
    //    kadanes(nums);
    //  }



    // Trapping rainwater question

//     public static int trappedRainwater(int height []){ // time complexity will O(n)

//       int n = height.length;
     
//       // calculate left max boundary

//       int leftMax[] = new int[n];
//       leftMax[0] = height[0];

//       for(int i = 1; i< n ; i++){
//         leftMax[i] = Math.max(height[i] , leftMax[i-1]);
//         System.out.print(leftMax[i] + " ");

//       }
//        System.out.println();
//       // calculate right max boundary
//       int rightMax[] = new int[n];
//       rightMax[n - 1] = height[n - 1];

//       for(int i = n-2 ; i >= 0 ; i --){

//         rightMax[i] = Math.max(height[i] , rightMax[i + 1]);
//         System.out.print(rightMax[i] + " ");


//       }

//        System.out.println();
       

//        int trappedWater = 0 ;
//       // loop for calculation of trapped water

//       for(int i = 0 ; i < n ; i++){
//         //waterlevel = min(leftMax boundary , rightMax boudary)
//         int waterLevel = Math.min(leftMax[i] , rightMax[i]);

//         //trappedwater = waterLevel - height[i]
//         trappedWater += waterLevel - height[i];

//       }

//       return trappedWater;

//     }
   
//       public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println("Trapped rainwater is: " + trappedRainwater(height));
//       }



//buying and selling stock problem (best time to buy and sell stock)


   public static int buyAndSellStocks(int prices[]){ // time complexity will be O(n)
     int buyPrice = Integer.MAX_VALUE;
     int maxProfit = 0;

     for (int i = 0 ; i <prices.length; i++){

       if(buyPrice < prices[i]){ // profut case
         int profit = prices[i] - buyPrice;  // today's profit
         maxProfit = Math.max(maxProfit , profit); // maximum of all days profit

       }else{
        buyPrice = prices[i]; // if price[i] is less then we should buy it so that we can gain profit in future days
       }

     }

      return maxProfit;
   }
    
    public static void main(String args[]){
      int prices[] = {7,1,5,3,6,4};
      System.out.println("Maximum profit is: " + buyAndSellStocks(prices));
    }

 }