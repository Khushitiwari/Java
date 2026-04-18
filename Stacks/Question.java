
import java.util.*;

public class Question{

    //Q1. fn to push an element at the bottom of stack
    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){ // base case
            s.push(data);
            return;
        }

        int top = s.pop();
         pushAtBottom(s, data);
         s.push(top);


    }

    // Q2. Reverse a string using stack

    public static String reverseString(String str){
        Stack<Character> s =new Stack<>();
        int idx = 0;

        while( idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);

        }

         return result.toString(); // updating str to the reversed string
    }


    // Q3. Reverse a stack using recursion
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s , top);
        
    }

    // fn to print stack
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }


    //Q4 Stock span problem
    public static void stockSpan(int stocks[] , int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0); // push index of first day

        for(int i = 1 ; i < stocks.length ; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice >= stocks[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i+1;

            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;

            }

            s.push(i); // push current day index onto stack
        }

    }




    public static void main(String args[]){
    // Q1
    //     Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);

    //     pushAtBottom(s, 4);

    //     while(!s.isEmpty()){
    //         System.out.println(s.pop());
    //     }

    // }

    //Q2
    // String str = "khushi";
    // String result = reverseString(str);
    // System.out.println("Reversed string is: " + result);

    //  String originial = reverseString(result);
    // System.out.println("Original string is: " + originial);
    


        //Q3 
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        
        // // System.out.println("Original Stack:");
        // // printStack(s);
        // reverseStack(s);
        // System.out.println("Reversed Stack:");
        // printStack(s);
   



     // Q4. Stock span problem
      // int stocks[] = {100, 80 , 60,70,60,85,100};
    //    int span[] = new int[stocks.length];

    //    stockSpan(stocks , span);

    //    for(int i = 0 ; i < span.length ; i++){
    //     System.out.println(span[i] + " ");
    //    }



    

    //Next greater element code
    // T.C O(n) S.C O(n)

    // variation of this question : Next greater left , Next smaller right element , next smaller left ,
    //  circular array next greater element
    int arr[] = {2,1,9,12,0,4};
    Stack<Integer> s = new Stack<>();
    int nextGreater[] = new int[arr.length];

     for( int i = arr.length-1; i>=0 ; i--){

        //step 1
        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
            s.pop();
        }

        //step 2
        if(s.isEmpty()){
            nextGreater[i] = -1;
        }else{
            nextGreater[i] = arr[s.peek()];
        }

        //step 3
        s.push(i);


     }

     for( int i = 0; i< nextGreater.length; i++ ){
        System.out.print(nextGreater[i]+ " ");

     }

     System.out.println();
       
 }

}