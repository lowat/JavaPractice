import java.util.*;

class Program {

    public int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> charFrequencies = new HashMap<Character, Integer>();
        for(int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);
            charFrequencies.put(currentChar, charFrequencies.getOrDefault(currentChar, 0) + 1);
        }

        for(int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);
            if(charFrequencies.get(currentChar) == 1) return i;
        }
        return -1;
    }
}