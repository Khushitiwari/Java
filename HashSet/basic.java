
import java.util.*;
public class basic {
    

    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(71);
        set.add(23);

        if(set.contains(1)){
           System.out.println("1 is present in the set");
        }
            set.remove(1);
    
            if(!set.contains(1)){
                System.out.println("1 is not present in the set");
            }
    
            System.out.println("Size of the set: " + set.size());


            // Iterating over the set USING Set.iterator()
            
            HashSet<String> cities = new HashSet<>();
            cities.add("Delhi");
            cities.add("Surat");
            cities.add("Pune");


            Iterator it = cities.iterator();
            while(it.hasNext()){        
                System.out.println(it.next());
            }

             // Iterating over the set USING for-each loop
             System.out.println("SPACE");
             for(String city : cities){
                System.out.println(city);
             }




    }
}
