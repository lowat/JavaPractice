import java.util.*;

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashSet<Integer> values = new HashSet<Integer>();

        for(int i = 0; i < array.length; i++){
            int match = targetSum - array[i];

            if(values.contains(match)){
                return new int[]{array[i], match};
            }else{
                values.add(array[i]);
            }
        }

        return new int[]{};
    }
}