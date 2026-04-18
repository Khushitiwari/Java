
import java.util.PriorityQueue;


public class SlidingWindow{


    static class Pair implements Comparable<Pair>{
      int idx;
      int val;

      public Pair( int val , int idx){
        this.val = val ;
        this.idx = idx;

      }

      @Override
      public int compareTo(Pair p2){
        //return this.val - p2.val; // sort in ascending order on the basis of value
        // for maximux sort in descending order on the basis of value
        return p2.val - this.val;
      }
    }

    public static void main(String args[]){ //O(nlogk)

        int arr[] = { 1, 3,-1,-3,5,3,6,7};

        int k = 3;

        int res[] = new int[arr.length-k+1];
        
       PriorityQueue<Pair> pq = new PriorityQueue<>();
       
       // to store the first window elements
       for( int i =0 ; i< k ;i++){
        pq.add( new Pair(arr[i] , i));

       }

        res[0] = pq.peek().val;

        for( int i =k; i<arr.length ; i++){

            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }

            pq.add( new Pair(arr[i] , i));
            res[i - k + 1] = pq.peek().val;
        }


       // print result 
       for( int i=0 ; i<res.length; i++){
        System.out.print(res[i]+" ");
       }

       System.out.println();


    }

}