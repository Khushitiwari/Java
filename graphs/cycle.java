import java.util.*;

public class cycle {
    

    static class Edge{
        int src;
        int dest;



        public Edge( int s , int d ){
            this.src = s ;
            this.dest = d;
        }
      
     }

      static void createGraph( ArrayList<Edge> graph[]){

            for( int i = 0 ; i < graph.length ; i++) { // har ek array index pe ek khali arraylist
                graph[i] = new ArrayList<>();
            }
         

            // ye nichee edges banaye hai

            //graph[0].add( new Edge ( 0 , 1));
            graph[0].add( new Edge ( 0 , 2 ));
            graph[0].add( new Edge( 0 , 3));

            graph[1].add( new Edge( 1, 2));
           //  graph[1].add( new Edge( 0  ,1 ));


            graph[2].add( new Edge( 2 , 0 ));
            graph[2].add( new Edge( 2, 1));


            graph[3].add( new Edge ( 3, 0));
            graph[3].add(new Edge (3 ,4));

            graph[4].add( new Edge( 4, 3));

        }


      public static boolean detectCycle( ArrayList<Edge>[] graph ){ //O( V+ E )

            boolean visited[] = new boolean [graph.length];

            for( int i = 0 ; i< graph.length ; i++){ // loop issliye h kyunki diffent disconnected components ke liye bhi check ho cycle 

                if( !visited[i] ){
                   if( detectCycleUtil( graph , visited , i , -1)){
                      return true;
                   }; // -1 because jisse start kiye uska parent nhi hotaa
                }
            }

            return false;
        }


        public static boolean detectCycleUtil(ArrayList<Edge>[] graph  , boolean visited[] , int curr , int parent ){
           

            visited[curr] = true;

            for( int i = 0 ; i < graph[curr].size() ; i++){
                Edge e = graph[curr].get(i); // jab jab neighbour chahiye ye krro
                
                // 3 cases for neighbours
                //case 3 not visited 
                if( ! visited[e.dest] ){
                    if( detectCycleUtil( graph , visited , e.dest  , curr )){
                    return true;
                    }
                    
                }else if(visited[e.dest] && e.dest != parent ){ // case 1 visited but not a parent 
                    return true;
                }
                // case 2 : Eat fivestar do nothing , continue ;


            }

            return false;



        }
    

    public static void main(String[] args) {

      int V = 5;
      ArrayList<Edge> graph[] = new ArrayList[V];
      createGraph(graph);
      System.out.println(detectCycle(graph));
        
    }
}
