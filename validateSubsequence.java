import java.util.*;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrPointer = 0;
        int seqPointer = 0;
        while(seqPointer < sequence.size()){
            if(arrPointer >= array.size()){
                return false;
            }
            if(array.get(arrPointer) == sequence.get(seqPointer)) {
                seqPointer++;
            }
            arrPointer++;
        }
        return seqPointer == sequence.size();
    }
}
