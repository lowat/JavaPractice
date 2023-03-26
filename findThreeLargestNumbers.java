class Program {
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] largestValues = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for(int value : array){
            placeValue(largestValues, value);
        }
        return largestValues;
    }

    public static void placeValue(int[] largestValues, int value){
        for(int i = largestValues.length - 1; i >= 0; i--){
            if(value > largestValues[i]){
                value = replace_value_at_index_and_return_prev_value(largestValues, value, i);
            }
        }
    }

    public static int replace_value_at_index_and_return_prev_value(int[] largestValues, int newValue, int index){
        int displacedValue = largestValues[index];
        largestValues[index] = newValue;
        return displacedValue;
    }

}