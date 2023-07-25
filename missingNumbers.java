import java.util.*;

class Program {
    public int[] missingNumbers(int[] nums) {
        int targetLine = getTargetLine(nums);
        int[] targetHalfSums = getTargetHalfSums(nums.length, targetLine);
        int[] actualHalfSums = getActualHalfSums(nums, targetLine);
        int firstHalfMissing = targetHalfSums[0] - actualHalfSums[0];
        int secondHalfMissing = targetHalfSums[1] - actualHalfSums[1];
        return new int[]{firstHalfMissing, secondHalfMissing};
    }

    private int getTargetLine(int[] nums){
        int total = 0;
        for(int i = 1; i <= nums.length + 2; i++) {
            total += i;
        }
        for(int num : nums){
            total -= num;
        }
        return total / 2;
    }

    private int[] getTargetHalfSums(int numsLength, int targetLine) {
        int[] targetHalfSums = new int[2];
        for(int i = 1; i <= numsLength + 2; i++) {
            if(i <= targetLine) {
                targetHalfSums[0] += i;
            } else {
                targetHalfSums[1] += i;
            }
        }
        return targetHalfSums;
    }

    private int[] getActualHalfSums(int[] nums, int targetLine) {
        int[] actualHalfSums = new int[2];
        for(int num : nums) {
            if(num <= targetLine) {
                actualHalfSums[0] += num;
            } else {
                actualHalfSums[1] += num;
            }
        }
        return actualHalfSums;
    }


}
