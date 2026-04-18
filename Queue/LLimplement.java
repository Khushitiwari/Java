
class Node{
    int val;
    Node next;

    public Node(int val , Node next){
        this.val = val;
        this.next = next;
    }

}

class LLimplement{
    Node head , tail;
    int count;
    int maxSize;
    

    public LLimplement(int size){
        this.maxSize = size;
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean enqueue(int value){
        if(isFull()){
            return false;
        }

        Node node = new Node(val , null);

        if(count == 0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;

        }
        
        count++;
        return true;


    }

    public booleab dequeue(){
        if(isEmpty()){
            return false;
        }

        head = head.next;
        count--;
        return true;
    }

    public int Front(){
        if(isEmpty()){
            return -1;
        }

        return head.val;
    }

    public int Rear(){
        if(isEmpty()){
            return -1;
        }

        return tail.val;
    }
    


     public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}


