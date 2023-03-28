import java.util.*;

class Program {
    public static int[] selectionSort(int[] array) {
        // Write your code here.
        int currentIndex = 0;
        while(currentIndex < array.length - 1){
            int smallestIndex = currentIndex;
            for(int i = currentIndex + 1; i < array.length; i++){
                if(array[smallestIndex] > array[i]){
                    smallestIndex = i;
                }
            }
            swap(currentIndex, smallestIndex, array);
            currentIndex++;
        }
        return array;
    }


    public static void swap(int indexOne, int indexTwo, int[] array){
        int temp = array[indexTwo];
        array[indexTwo] = array[indexOne];
        array[indexOne] = temp;
    }
}
