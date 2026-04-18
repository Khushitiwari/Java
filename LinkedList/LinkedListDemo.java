// this file consists of the questions of linked list
public class LinkedListDemo{

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

    // delete nth node from end
    public void deleteNthNodeEnd(int n){

        //calculaye size 
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if( n == size){
            head = head.next; // remove first node
            return;

        }

        // size - n 
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while( i < iToFind){
            prev = prev.next;
            i++;
        }

      // java has garbage collection for memory management
      // it will automatically remove unreferenced nodes

       prev.next = prev.next.next;
       return;
      
    }

    // to check if linked is palindrome or not
    // step 1 to find mid using slow fast approach
    public Node findMid(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // jump 1 step
            fast = fast.next.next;// jump 2 steps

        }

         return slow; // slow will be mid node

    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        // step 1 : find mid
        Node midNode = findMid(head);


        //step 2: reverse the second half part
        Node prev = null;
        Node curr = midNode;
        Node next;

        while( curr != null){
            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr =next;
        }

        Node right =  prev ; // right half head
        Node left = head; 




        // step 3: check if right or left part is equal or not

        while( right != null){
            if( left.data != right.data ){
                return false;

            }
            left = left.next ;
            right = right.next;
        }

        return true;

    }


    // detecting a cycle in linked list

    public static boolean  isCycle(){
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;


            if(fast == slow){
                return true; // cycle exists
            }
        }
        return false; // cycle does not exist
    }

    

    // remove the cycle from linked list
    public static void removeCycle(){
        // step :1 detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;


        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }

        
        }


        if(cycle == false){
            return;
        }


        // step 2: finding meeting point
        slow = head ;
        Node prev = null; // it will store last node
        while( slow != fast){

            prev = fast;
            slow= slow.next;
            fast = fast.next;
        }


        // step 3 : removing the cycle by putting last node = null
        prev.next = null;

    }


    public static void main(String args[]){

       //creating new linked list
       LinkedList ll = new LinkedList();

        // ll.print();

        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.print();

        // ll.addLast(2);
        // ll.addLast(3);

        // ll.print();

        // //ll.deleteNthNodeEnd(2);
        // //ll.print();


        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
      // head.next.next.next = head;
        // 1 -> 2-> 3 -> 1;

       head = new Node(1);
       Node temp = new Node(2);
       head.next = temp;
       head.next.next = new Node(3);
       head.next.next.next = temp;
       // 1->2->3->2


        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());




    }
}