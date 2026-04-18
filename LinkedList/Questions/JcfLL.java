
//  Java collection frameworks

import java.util.*;

public class JcfLL{

    public static void main( String args[]){
        // create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.addFirst(4);
        // 0->1->2
         
         System.out.println(ll);


        // remove
        ll.removeLast();
        ll.removeFirst();

        

    }
}