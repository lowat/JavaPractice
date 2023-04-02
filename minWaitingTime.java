import java.util.*;

class Program {

    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int timeWaited = 0;
        int queriesRan = 0;
        for(int i = 0; i < queries.length - 1; i++){
            queriesRan += queries[i];
            timeWaited += queriesRan;
        }
        return timeWaited;
    }
}