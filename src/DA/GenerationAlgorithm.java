package DA;

import java.util.List;
import java.util.Map;

public class GenerationAlgorithm {
    public void generateBinarySequences (int n , List<String> sequences) {
        int [] arr = new int[n];
        boolean stop = false;
        while (!stop) {
            StringBuilder biSequence = new StringBuilder();
            for (int x : arr) {
                biSequence.append(x);
            }
            sequences.add(biSequence.toString());
            int i = n-1 ;
            while ((i >= 0 ) && (arr[i] == 1)) {
                i--;
            }
            if ( i >= 0) {
                arr[i] = 1;
            }
            for(int j = i+1;  j < n ; j++) {
                arr[j] = 0;
            }

        }
    }
    public void generateSubsets (int n , int k  , Map<Integer , List<Integer>> sequences ) {

    }
    public void generatePermutations (int n , int k  , Map<Integer , List<Integer>> sequences ) {}
}
