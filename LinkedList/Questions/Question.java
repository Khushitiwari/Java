
public class Question {

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



    // MergeSort on linkedList

    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next; // to get first mid in even length ll


        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;// mid node
    }


    private static Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;


            }
        }
       // for remaining elements
        while(head1 != null){
             temp.next = head1;
             head1 = head1.next;
             temp = temp.next;
        }

         while(head2 != null){
             temp.next = head2;
             head2 = head2.next;
             temp = temp.next;


        }

        return mergedLL.next;
    }

    public static Node mergeSort(Node head){

        //base case
        if(head == null || head.next == null){
            return head; // linked list aleardy sorted
        }

        // step 1 find mid
        Node mid = getMid(head);

        // step 2 left and right mergeSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);




        //step 3 merging left and right
        return merge(newLeft, newRight);

    }

     public static void main(String args[]){
        Question ll = new Question();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
       // 6 -> 5 -> 4 -> 3 -> 2 -> 1

        
        ll.print();
        ll.head = mergeSort(ll.head);
        ll.print();

     }
}