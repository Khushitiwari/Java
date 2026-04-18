import java.util.*;

public class BST {

    static  class Node{
        int data;
        Node left;
        Node right;

        Node( int data){
            this.data = data;
        }

    }


    public static Node insert(Node root , int val){

        if( root == null){
            root = new Node(val);
            return root;

        }

        if( root.data > val){

            // insert in left side
            root.left = insert(root.left, val);
        }else{

            // insert in the right side
            root.right = insert( root.right , val);
        }

        return root;

    }

    public static void inorder( Node root){

        if( root == null){
            return;
        }

        
       inorder(root.left);
       System.out.print(root.data+" ");
       inorder(root.right);


    }


    // to serach in binary search tree
    public static boolean search(Node root , int key){ // T.C = o(H) , H = height of tree
        if( root == null){
            return false;
        }

        //  root is equal to root
        if( root.data == key){
            return true;
        }
        
        // if key is less than root data
        if( root.data < key){
            return search( root.right , key);
        }
          else{     // if key is more than root data
            return search( root.left , key);
        }
      
    }
    


    // to delete a node from bst
    public static Node delete(Node root , int  val){
        if(root.data < val){
            root.right = delete(root.right, val);

        }else if( root.data > val){
            root.left = delete(root.left, val);

        }else{ // voila! node found
            // case 1 : leaf node
            if(root.left == null && root.right == null){
              return null;
            }

            // case 2 : single child
            if(root.left == null){
                return root.right;
            }else if( root.right == null){
                return root.left;
            }

            // case 3 : two or more children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete( root.right , IS.data); 

        }    

        return root;
        
        
    }  


       public static Node findInorderSuccessor(Node root){

          while( root.left != null){
            root = root.left;
          }

          return root;
       }
    
        
       public static void printInRange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }

         if(root.data >= k1 && root.data <= k2){
            printInRange(root.left , k1 , k2);
            System.out.print(root.data+" ");
            printInRange(root.right , k1, k2);
          }else if( root.data < k1 ){
            printInRange( root.right, k1 ,k2);
          }else{
            printInRange(root.left, k1, k2);
          }

        
       }
    
       public static void printPath(ArrayList<Integer> path)
       {
         for( int i = 0 ; i < path.size() ; i++){
            System.out.print(path.get(i)+" ->");
         }
         System.out.println();
       }

       public static void printRoot2Leaf( Node root , ArrayList<Integer> path ){
          if( root == null){
              return;
          }

          path.add(root.data);
          if( root.left == null && root.right == null){
             printPath(path);
          }

          printRoot2Leaf(root.left , path);
          printRoot2Leaf(root.right , path);
          path.remove(path.size() - 1);

       }

       // function to check is if a tree is valid bst pr not
         public static boolean isValidBST( Node root , Node min , Node max){

            if(root == null){
                return true;
            }

            
            if( min != null && root.data <= min.data){
                 return false;
            } else if( max != null && root.data >= max.data){
                return false;
            }


            return isValidBST(root.left , min , root) && isValidBST(root.right , root , max);
             
         }

         
         //function to mirror a BST
         public static Node createMirror( Node root){ // T.C O(n)
              if( root == null ){
                return null;
              }


              Node leftMirror = createMirror( root .left);
              Node rightMirror = createMirror( root.right);

              root.left = rightMirror;
              root.right = leftMirror;
              return root;
         }

          // to check if correct mirror BST is formed
          public static void preorder( Node root){
               if( root == null ){
                return;
               }

               
               System.out.print(root.data+" ");
               preorder(root.left);
               preorder(root.right);
              
          }

          // function to create BST from sorted array
        public static Node createBST(int arr[], int start , int end){

            if( start > end){
                return null;
            }

            int mid = (start + end )/2;
            Node root =  new Node(arr[mid]);
            root.left = createBST(arr , start , mid- 1);
            root.right = createBST(arr , mid +1  , end);

            return root;

        }

         // to get inorder 
         public static void getInorder( Node root , ArrayList<Integer> inorder){
             
            if( root == null){
                return;
            }


            getInorder(root.left , inorder);
            inorder.add( root.data);
            getInorder( root.right , inorder);

         }


         // function to create BST from sorted arraylist
         public static Node createBST( ArrayList<Integer> inorder,int start , int end){
             if( start > end){
                return null;
             }

             int mid =  (start + end)/2;
             Node root = new Node(inorder.get(mid));
             root.left = createBST(inorder , start , mid-1);
             root.right = createBST(inorder , mid + 1  , end);
             return root;



         }
        //function to covert BST to balanced BST
        public static Node balancedBST( Node root){ // T.C = O(n)
             // inorder sequence  O(n)
             ArrayList<Integer> inorder = new ArrayList<>();
             getInorder(root, inorder);
                

             //sorted array -> Balanced BST O(n)
             root = createBST(inorder , 0 , inorder.size() -1);
             return root;

        }





       public static void main(String[] args) {
        //int values[] = { 5 , 1, 3, 4 ,2, 7,};

        //int values[] = {8,5,3,1,4,6,10,11,14};
        //int values[] = {1,1,1,1};
      //  Node root = null;

        // for( int i = 0 ; i < values.length ; i++){
        //      root = insert(root, values[i]);
        // }

        //inorder(root);
        // if(search(root, 99)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("not found");
        // }

        // root = delete( root , 10);
        // System.out.println();
        // inorder(root);

        // printInRange(root, 10, 12);
        // System.out.println();

        // inorder(root);
        // System.out.println();

        //printRoot2Leaf(root, new ArrayList<>());

        // if( isValidBST(root, null ,null)){
        //     System.out.println("valid");
        // }else{
        //     System.out.println("not valid");
        // }

      

     // Mirror BST
    //   Node root = new Node(8);
    //   root.left = new Node(5);
    //   root.right = new Node(10);
    //   root.left.left = new Node(3);
    //   root.left.right = new Node(6);
    //   root.right.right = new Node(11);
      


      // Mirror BST
         /*

           8
         /   \
        10     5
       /      / \
      11     6   3

        */


    //   root = createMirror(root);
    //   preorder(root);
    //    System.out.println();




      // Sorted array to balanced BST
      //int arr[] ={ 3, 5, 6,8,10,11,12};

      /* expected BST

           8
         /   \
        5    11
       / \   / \
      3   6 10 12

        */

    //    Node root = createBST( arr, 0 ,  arr.length-1);
    //    preorder(root);


       // Convert BST to balanced BST

       /* 

           8
         /  \
        6   10
       /      \
      5        11
     /           \
    3             12

        */

      Node root = new Node( 8);
      root.left = new Node(6);
      root.right = new Node(10);
      root.left.left = new Node(5);
      root.left.left.left = new Node(3);
      root.right.right = new Node(11);
      root.right.right.right = new Node(12);

      root = balancedBST(root) ;
      preorder(root);
      
       

       



    }
}
