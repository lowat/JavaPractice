import java.util.*;

class Program {

    public int firstDuplicateValue(int[] array) {
        for(int value : array) {
            int absValue = Math.abs(value);
            if(array[absValue - 1] < 0){
                return absValue;
            }
            array[absValue - 1] = array[absValue - 1] * -1;
        }
        return -1;
    }
}
