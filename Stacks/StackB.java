import java.util.*;

public class StackB{

//implement stack using array by yourself
// implementation of stack using ArrayList
    // static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty(){
    //        return list.size() == 0; // whenenver list size is zero it will retur true else false
    //     }


    //     //push 
    //     public static void push(int data){
    //         list.add(data); // add fn automatically adds the data at the last index
    //     }


    //     //pop
    //     public static int pop(){
    //         // edge cases
    //         if(isEmpty()){

    //             return -1;
    //         }

    //         int top = list.get(list.size()-1); 
    //         list.remove(list.size()-1);
    //         return top;

    //     }

    //     //peek
    //     public static int peek(){
    //         // edge cases
    //         if(isEmpty()){

    //             return -1;
    //         }

    //        return list.get(list.size()-1); 

    //     }
    

    // implementation of stack using LinkedList
    //    static class Node{
    //     int data;
    //     Node next;
    //     Node( int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    //    }

    //     static class Stack {
    //         static Node head = null;


    //         public static boolean isEmpty(){
    //             return head == null; // whenenver list size is zero it will retur true else false
    //         }

    //         //push fn
    //         public static void push(int data){
    //             Node newNode = new Node(data);

    //             if(isEmpty()){
    //                 head = newNode;
    //                 return;
    //             }

    //             newNode.next = head;
    //             head = newNode;
    //         }


    //         //pop fn
    //         public static int pop(){
    //             if(isEmpty()){
    //                 return -1;
    //             }

    //             int top = head.data;
    //             head = head.next;
    //             return top;
    //         }


    //         //peek fn
    //         public static int peek(){
    //             if(isEmpty()){
    //                return -1;
    //             }

    //             return head.data;
    //         }
    //     }



    public static void main(String args[]){

      //  Stack s = new Stack();// manual implementation of stack
       Stack<Character> s = new Stack<>(); // inbuilt stack class ( java collection franework)
       //or Stack<Integer> s = new Stack<>();
        s.push('a');
        s.push('r');
        s.push('y');
        s.push('a');
        s.push('n');


        while( !s.isEmpty()){
           System.out.println(s.peek());
           s.pop(); 
        }


    }
}
