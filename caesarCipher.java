import java.util.*;

class Program {
    public static String caesarCypherEncryptor(String str, int key) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < str.length(); index++){
            char c = str.charAt(index);
            int currentLetterIndex = alphabet.indexOf(c);
            int newLetterIndex = (currentLetterIndex + key)%26;
            sb.append(alphabet.charAt(newLetterIndex));
        }
        return sb.toString();
    }
}
