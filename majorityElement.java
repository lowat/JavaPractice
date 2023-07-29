import java.util.*;

class Program {
    public int majorityElement(int[] array) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i < array.length; i++){
            ans = count == 0 ? array[i] : ans;
            count = ans == array[i] ? count + 1 : count - 1;
        }
        return ans;
    }
}
