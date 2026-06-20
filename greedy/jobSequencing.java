import java.util.*;

public class jobSequencing {

    static class Job{
        int deadline;
        int profit;
        int id;  // 0 , 1 , 2 for jons A , B , C ....

        public Job( int i , int d , int p){
            id = i ;
            deadline = d;
            profit = p;
        }


    }
    
    public static void main(String[] args) {
        
        int jobsInfo[][] = {{4,20} , {1 ,10} , { 1, 40} , {1 , 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for( int i = 0 ; i < jobsInfo.length ; i++ ){

            jobs.add(new Job( i , jobsInfo[i][0] , jobsInfo[i][1])); // 0 col => deadline , 1 => profit


        }


       //  Collections.sort( jobs , ( a ,b) -> a.profit - b.profit ); // ascending order , a and b are 2 objects obj1 and obj2 on which sorting should be performed
        Collections.sort( jobs , ( a,b ) -> b.profit - a.profit ); // descending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for(  int i = 0 ; i < jobs.size() ; i++){
            Job curr = jobs.get(i);
            if( curr.deadline > time){
                seq.add(curr.id);
                time++;
            }

        }

        // print sequence
        System.out.println("max jobs = " + seq.size());
        for( int i = 0 ; i < seq.size() ; i++){
            System.out.print(seq.get(i)+ " ");
        }
        System.out.println();
        

    }
}
