import java.util.*;
// or import java.util.Queue;
public class Interview {
    public static void main(String[] args) {

      // 1. Initialization   
      Queue<Integer> queue = new LinkedList<>(); // we can initialise queue using arrayDeque as well
      // Queue<Integer> q = new ArrayDequeue<>();

      
      // 2. add elements
      queue.offer(10);
      queue.offer(20);

      // 3. Print
      System.out.println(queue);

    
      // 4. front
      int front = queue.peek();
      System.out.println("Front element: " + front);

      // Remove 
      int remove = queue.poll();
      System.out.println("Remove" + remove);
      System.out.println("After removing" + queue);


      // 6. check if the queue is empty or not
      System.out.println("Is queue empty" +queue.isEmpty());
      queue.poll();
      System.out.println();













    }
}