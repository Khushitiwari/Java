
import java.util.*;


public class maxLenChain { // O( nlogn )

    public static void main(String[] args) {
        int pairs[][] = {{5,24} , {39, 60} , {5,28} , {27 , 40} , { 50 , 90}};
        Arrays.sort(pairs , Comparator.comparingDouble(o-> o[1]));

        int len = 1;
        int pairEnd = pairs[0][1]; // last selected pair end or chain end

        for( int i = 1 ; i < pairs.length ; i++){
            if( pairs[i][0] > pairEnd){ // pairs[i][0] = start
                len++;

                pairEnd = pairs[i][1]; // end

            }
        }

        System.out.println("max length of chain is = " +len);

    }
    
}
