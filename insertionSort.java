import java.util.*;

class Program {
    public static int[] insertionSort(int[] array) {
        if (array.length == 0){
            return new int[]{};
        }
        for (int i = 1; i < array.length; i++){
            int j = i;
            while (j > 0 && array[j] < array[j-1]){
                swap(array, j-1, j);
                j-=1;
            }
        }
        return array;
    }

    public static void swap(int[] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}