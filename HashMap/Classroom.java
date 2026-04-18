import java.util.*;
public class Classroom{
    
    public static void main(String args[]){
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
         hm.put("Khushi" , 71);
         hm.put("Soha" , 44);
            hm.put("Satyarth" , 45);
         System.out.println(hm);


         TreeMap<String,Integer> tm = new TreeMap<>();
         tm.put("Khushi" , 71);
         tm.put("Soha" , 89);
         tm.put("Satyarth" , 45);
         System.out.println(tm);


    }
}
