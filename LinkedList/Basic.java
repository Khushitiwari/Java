
public  class Basic{

    public static class Node{
        int data;
        Node next;

        // Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }


    }

    //creating head and tail
    public static Node head;
    public static Node tail;
    public static int size;

    //adding elements to linked list
    public void addFirst(int data){
        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2: newNode next = head
        newNode.next = head; // linking

        //step 3: head = newNode
        head = newNode;
    }


    // adding elements to last
    public void addLast(int data){
        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2: tail next = newNode
        tail.next = newNode; // linking

        //step 3: tail = newNode
        tail = newNode;
    }

    //printing linked list
    public void print(){

        if( head == null){
            System.out.println("linked list is empty");
            return;
        }

     
        Node temp = head;
        while(temp != null){
        System.out.print(temp.data + "->");
        temp = temp.next;

        }

        System.out.println("null");
    }


    // add in the middle T.C is O(n)
   public void addMid(int data , int idx){
      if(idx == 0){
        addFirst(data);
        return;
      }
         size++;

      Node newNode = new Node(data);
      Node temp = head;

      int i = 0 ;
      while(i < idx - 1){
        temp = temp.next;
        i++;

      }

    // i =idx-1; temp -> prev
    newNode.next = temp.next;
    temp.next = newNode;





  }

    

    // remove nodes from the linked list
    public int removeFirst(){
        if(size == 0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if( size == 1){
            int val = head.data;
            head = tail  = null;
            size = 0;
            return val;
        }

        int val =  head.data;
        head = head.next;
        size--;
        return val;
    }
   

    // remove from last

    public int removeLast(){
        if(size == 0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if( size == 1){
            int val = head.data;
            head = tail  = null;
            size = 0;
            return val;
        }

       // size >=2
       Node prev = head;
       for(int i = 0; i < size - 2; i++){
        prev = prev.next;
       }

       int val =  prev.next.data ;//tail.data; 
       prev.next = null;
       tail = prev;
       size--;
       return val;

    }

    //searching in linked list
    public int search(int key ){
        Node temp = head;
        int i = 0;
        
        while(temp != null){
            if(temp.data == key){
                
                return i;

            }
            temp = temp.next;
            i++;
        }
       
       return -1;

    }


    
    public int helper(Node head , int key){ // T.C = O(n) S.C = O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }

        return idx + 1;


    }

    public int recSearch(int key){

        return helper(head , key);

    }



    //reversing in linkedlist

    public void reverse(){
        Node prev = null;
        Node curr = tail = head; // assignment in java is right to left
        Node next;


        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev; // as curr becomes null prev is at last node

    }



    public static void main(String[] args) {

        //creating new linked list
        Basic ll = new Basic();

        ll.print();

        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();

        ll.addLast(4);
        ll.addLast(5);

        ll.addMid(9, 2);
        ll.print();

        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();

      System.out.println("size of ll is :"+ size);
        System.out.println("index of 9 is :"+ ll.search(9));

        System.out.println("index of 3 is :"+ ll.recSearch(9));


        ll.reverse();
        ll.print();



    
    }
}