import java.util.*;

class Program {
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int endPointer = array.length - 1;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < endPointer; i++){
                if(array[i] > array[i + 1]){
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
            endPointer--;
        }
        return array;
    }

    public static void swap(int[] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}