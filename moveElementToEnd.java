import java.util.*;

class Program {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int left = 0;
        int right = array.size() - 1;
        while(left < right){
            int leftValue = array.get(left);
            int rightValue = array.get(right);
            if(leftValue == toMove && rightValue != toMove){
                swap(left, right, array);
                left++;
                right--;
            } else if(leftValue != toMove){
                left++;
            } else if(rightValue == toMove) {
                right--;
            }
        }
        return array;
    }

    public static void swap(int indexOne, int indexTwo, List<Integer> array){
        int temp = array.get(indexOne);
        array.set(indexOne, array.get(indexTwo));
        array.set(indexTwo, temp);
    }
}
