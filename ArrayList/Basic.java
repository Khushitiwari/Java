
// Basics of ArrayList in Java
// import java.util.ArrayList;
import java.util.*;
public class Basic{
    
    public static void swap(ArrayList<Integer> numbers, int idx1 , int idx2){
       int temp = numbers.get(idx1);
       numbers.set(idx1 , numbers.get(idx2));
       numbers.set(idx2 , temp);
  }

    public static void main(String args[]){
    // syntax to declare an ArrayList
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();

    // Operations on ArrayList

    numbers.add(10); // Adding an element
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    numbers.add(60);


    numbers.add(1 , 5); // adding element at specific index

    list.add("Khushi");
    list.add("you have");
    list.add("to be");
    list.add("consistent");

    System.out.println("ArrayList: " + list);
    System.out.println("Numbers: " + numbers);


    // get element at any index

    // int element = numbers.get(1);
    // System.out.println("element is " + element);

    // String word = list.get(2);
    // System.out.println("word is - " + word);


    // delete or remove element
    // list.remove(2);
    // System.out.println("ArrayList after removing element at index 2: " + list);

    // Set Operation - to update or modify an element at a specific index
    // list.set(1, "must be");
    // System.out.println("ArrayList after updating element at index 1: " + list);
    


   // contains operation - to check if an element is present in the ArrayList
    boolean ans = list.contains("you");
    System.out.println("Is 'consistent' present in the list? " + ans);
    

    // size of ArrayList
    int size = list.size();
    System.out.println("size of ArrayList: " + size);

    // to print all elements using loop
    for(int i = 0 ; i<list.size(); i++){
        System.out.print(list.get(i) + " ");
    }

    System.out.println();


    // to rpint the list of numbers in reverse order

    for(int i = numbers.size()-1 ; i>=0 ; i--){
        System.out.println(numbers.get(i));

        
     }


    // find max number in the ArrayList
     int max = Integer.MIN_VALUE;
     for(int i =0 ; i < numbers.size() ; i++){
        // if(max< numbers.get(i)){
        //     max = numbers.get(i);
           
        // }

        max = Math.max(max , numbers.get(i)); // using inbuilt function
        
     }
      System.out.println("max number is " +max);


      // To swap the elements at two indices in an ArrayList
    //   int idx1 = 2;
    //   int idx2 = 4;
    //   System.out.println("Before swapping: " + numbers);

    //   swap(numbers , idx1 , idx2);
    //   System.out.println("After swapping: " + numbers);

      
        
   // to sort the ArrayList by inbuilt fn
    Collections.sort(numbers);// ascending order
    

    // System.out.println("Sorted numbers: " + numbers); 

    // Collections.sort(numbers , Collections.reverseOrder()); // descending order
    // System.out.println("Sorted numbers: " + numbers); 

    //Comparator function to sort in custom order




    // multidimensional ArrayList

    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    ArrayList<Integer> list1 = new ArrayList<>(); // first inner ArrayList
    list1.add(1);
    list1.add(2);
    list1.add(3);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(4);
    list2.add(5);
    list2.add(6);

    mainList.add(list1); // adding in  multi dimensional ArrayList
    mainList.add(list2);

    for(int i = 0 ; i <mainList.size() ; i++){
        ArrayList<Integer> currList = mainList.get(i);
        System.out.println("The list is :");
        for(int j = 0 ; j <currList.size() ; j++){
            System.out.print( currList.get(j)+ " ");

        }

        System.out.println();
    }


    System.out.println(mainList);






        
 
}



}