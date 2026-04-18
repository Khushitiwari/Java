import java.util.*;
public class Reversal {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();


        // removing queue elements and pushing into stacks
        while( !q.isEmpty()){
            s.push(q.remove());

        }


        // adding the elemets in queue from stacks ( it will be reversed )
        while( !s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

         reverse(q);

         //print Q
         while( !q.isEmpty()){
            System.out.println(q.remove() + " ");

         }

          System.out.println();


    }

}
