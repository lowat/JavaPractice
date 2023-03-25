class Program {
    public static int binarySearch(int[] array, int target) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        while(leftPointer <= rightPointer) {
            int midPointer = (rightPointer + leftPointer) / 2;
            int midValue = array[midPointer];
            if(target == midValue) return midPointer;
            if(target > midValue){
                leftPointer = midPointer + 1;
            }  else {
                rightPointer = midPointer - 1;
            }
        }
        return -1;
    }
}