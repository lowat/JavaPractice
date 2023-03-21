class Program {
    public String runLengthEncoding(String string) {
        StringBuilder encodedString = new StringBuilder();
        int currentCharCount = 0;
        char currentChar = string.charAt(0);
        for(int index = 0; index < string.length(); index++){
            char newChar = string.charAt(index);
            if(newChar != currentChar || currentCharCount >= 9){
                encodedString.append(currentCharCount);
                encodedString.append(currentChar);
                currentChar = newChar;
                currentCharCount = 0;
            }
            currentCharCount++;
        }
        encodedString.append(currentCharCount);
        encodedString.append(currentChar);
        return encodedString.toString();
    }
}