import java.util.*;
public class Basic{

    public static void main(String args[]){
        // Creating hash map to store Country and its population
        // Craete or initialise hashmap
        HashMap<String , Integer> hm = new HashMap<>();

        // Insertion O(N)
        
        hm.put("India" , 120);
        hm.put("USA" , 30);
        hm.put("China" , 150);
        hm.put("Russia" , 20);
        System.out.println(hm);


        // Accessing the value O(1) get method
        int population = hm.get("India");
        System.out.println("Population of India : " + population);

       //ContainsKey O(1)
        
        System.out.println(hm.containsKey("UK") );//true

        // Remove O(1)
        hm.remove("Russia");
        System.out.println(hm);


        // Size O(1)
        System.out.println("Size of hashmap : " + hm.size());

        // Is empty O(1)
        System.out.println(hm.isEmpty());

        // Clearing the hashmap O(1)
        hm.clear();
        System.out.println(hm);


        // Iterating over the hashmap O(N)
        Set<String> keys =  hm.keySet();
        System.out.println(keys);

        for( String k : keys){
          System.out.println("key="+k +", value="+hm.get(k));
        }
       

        // containsKey and containsValue methods

    }
}