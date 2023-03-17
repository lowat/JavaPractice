import java.util.*;

class Program {

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> scoreboard = new HashMap<String, Integer>();

        String leadingTeam = "";
        int highScore = Integer.MIN_VALUE;

        for(int idx = 0; idx < results.size(); idx++){
            int currentCompetitionWinningIdx = results.get(idx) == 1 ? 0 : 1;
            int currentWinningTeamScore = 3;
            String currentCompetitionWinningTeam = competitions.get(idx).get(currentCompetitionWinningIdx);
            if(scoreboard.containsKey(currentCompetitionWinningTeam)){
                currentWinningTeamScore += scoreboard.get(currentCompetitionWinningTeam);
            }
            scoreboard.put(currentCompetitionWinningTeam, currentWinningTeamScore);
            if(currentWinningTeamScore > highScore){
                highScore = currentWinningTeamScore;
                leadingTeam = currentCompetitionWinningTeam;
            }

        }
        return leadingTeam;
    }
}
