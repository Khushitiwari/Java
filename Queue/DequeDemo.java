import java.util.*;

public class DequeDemo{
    
    public static void main(String[] args) {
        
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first el = " + deque.getFirst());
        System.out.println("last el = " + deque.getLast());



    }
}
