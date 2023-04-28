import java.util.*;

class Program {
    public static int productSum(List<Object> array) {
        return productSum(array, 1);
    }

    public static int productSum(List<Object> array, int depth){
        int sum = 0;
        for(int i = 0; i < array.size(); i++){
            int currentValue = array.get(i) instanceof ArrayList ? productSum((List<Object>)array.get(i), depth + 1) : (int)array.get(i);
            sum += currentValue;
        }
        return depth * sum;
    }
}