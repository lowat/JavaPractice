class Program {
    public static boolean isMonotonic(int[] array) {
        boolean nonDecreasing = true;
        boolean nonIncreasing = true;

        if(array.length <= 1){
            return true;
        }

        int prevValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > prevValue){
                nonDecreasing = false;
            }
            if(array[i] < prevValue){
                nonIncreasing = false;
            }
            prevValue = array[i];
        }


        return nonDecreasing || nonIncreasing;
    }
}
