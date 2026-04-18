
import java.util.*;
// Implementation of queue using ArrayList
public class Implementation{
    List<Integer> list ;
    int ptr;

    public Implementation(){
        list = new ArrayList<>();
        ptr = 0;
    }

    public void enqueue(int x){
        this.list.add(x);

    }

    public boolean dequeue(){
        if(ptr == list.size()){ // empty queue
            return false;
        }
        ptr++;
        return true;
    }

    public int front(){
        if(ptr == list.size()){
            return -1; // empty queue
        }
        return list.get(ptr);
    }

    public static void main(String[] args){
        Implementation queue = new Implementation();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.front()); // 10
        queue.dequeue();
        System.out.println(queue.front()); // 20
    }
}