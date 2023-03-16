import java.util.*;

class Program {

    public boolean generateDocument(String characters, String document) {
        return ableToGenerateDocumentFromCharMap(document, generateCharMapFromString(characters));
    }

    private HashMap<Character, Integer> generateCharMapFromString(String string) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);
            boolean charInMap = charMap.containsKey(currentChar);
            int numAppearences = charInMap ? charMap.get(currentChar) : 0;
            charMap.put(currentChar, numAppearences + 1);
        }
        return charMap;
    }

    private boolean ableToGenerateDocumentFromCharMap(String document, HashMap<Character, Integer> charMap){
        for(int i = 0; i < document.length(); i++){
            char currentChar = document.charAt(i);
            if(!charMap.containsKey(currentChar)) return false;

            int numCharStockRemaining = charMap.get(currentChar);
            if(numCharStockRemaining <= 0) return false;

            charMap.put(currentChar, numCharStockRemaining - 1);
        }
        return true;
    }
}