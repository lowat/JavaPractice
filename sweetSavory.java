import java.util.*;

class Program {

    public int[] sweetAndSavory(int[] dishes, int target) {
        Arrays.sort(dishes);
        int left = 0;
        int right = dishes.length - 1;
        int closestValue = Integer.MAX_VALUE;
        int[] result = new int[2];
        while(left < right && dishes[left] < 0 && dishes[right] > 0) {
            int currentValue = dishes[left] + dishes[right];
            if(currentValue > target){
                right--;
                continue;
            }
            int currentDiff = target - currentValue;
            if(currentDiff <= closestValue){
                result[0] = dishes[left];
                result[1] = dishes[right];
                closestValue = currentDiff;
                if(currentValue == target) {
                    return result;
                }
            }
            left++;
        }
        return result;
    }
}