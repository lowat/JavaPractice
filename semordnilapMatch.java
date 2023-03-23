import java.util.*;

class Program {
    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        HashSet<String> semordnilapMatch = new HashSet<String>(Arrays.asList(words));
        ArrayList<ArrayList<String>> semordnilapPairs = new ArrayList<ArrayList<String>>();

        for(String word : words){
            String currentReversedWord = new StringBuilder(word).reverse().toString();
            if(semordnilapMatch.contains(currentReversedWord) && !currentReversedWord.equals(word)){
                ArrayList<String> semordnilapPair = new ArrayList<String>();
                semordnilapPair.add(word);
                semordnilapPair.add(currentReversedWord);
                semordnilapPairs.add(semordnilapPair);
                semordnilapMatch.remove(word);
                semordnilapMatch.remove(currentReversedWord);
            }
        }
        return semordnilapPairs;
    }
}