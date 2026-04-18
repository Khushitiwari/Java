import java.util.*;

public class Priority{


    static class Student implements Comparable<Student>{
         String name;
         int rank;

         public Student (String name , int rank){
             this.name = name;
             this.rank = rank;

         }

         @Override
         public int compareTo(Student s2 ){
            return this.rank - s2.rank;
         }
    }


    public static void main(String[] args) {
    
   
    PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Comparator.reverseOrder() for reversing the order ( for descending order )

    pq.add(new Student("A" , 2)); // T.C O(logn)
    pq.add(new Student("B" , 4));
    pq.add(new Student("C" , 8));
    pq.add(new Student("D" , 1));
    pq.add(new Student("E" , 9));
    


    while( !pq.isEmpty()){
        System.out.println(pq.peek().name + " -> " + pq.peek().rank); //O(1)
        pq.remove(); // T.C O(logn)
      

    }


  }


}
