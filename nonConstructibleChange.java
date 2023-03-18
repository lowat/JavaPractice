import java.util.*;

class Program {

    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int currentMaxChange = 0;
        for(int coin : coins){
            if(coin > currentMaxChange + 1){
                return currentMaxChange + 1;
            }
            currentMaxChange += coin;
        }
        return currentMaxChange + 1;
    }
}