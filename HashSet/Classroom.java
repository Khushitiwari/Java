import java.util.*;
public class Classroom {

    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Surat");
        cities.add("Pune");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Surat");
        lhs.add("Pune");

        System.out.println("HashSet: " + cities);
        System.out.println("LinkedHashSet: " + lhs);

        // Same operations as HashSet can be performed on LinkedHashSet AND treeset as well. It also does not allow duplicates 
        // and does not maintain any order of elements. The only difference is that it maintains the insertion order of elements. So, when we iterate over the LinkedHashSet, it will return the elements in the order they were inserted, 
        // whereas HashSet does not guarantee any order of elements.

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Surat");
        ts.add("Pune");
        System.out.println(ts);
    }
    
}
