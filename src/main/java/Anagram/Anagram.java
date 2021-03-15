package Anagram;

import java.util.StringJoiner;

public class Anagram {

    public static final String DELIMITER = " ";

    private String reverseWord(char[] wordToReverse) {
        int leftIndex = 0;
        int rightIndex = wordToReverse.length - 1;
        while (leftIndex <= rightIndex) {
            if (Character.isLetter(wordToReverse[leftIndex]) && Character.isLetter(wordToReverse[rightIndex])) {
                char leftChar = wordToReverse[leftIndex];
                wordToReverse[leftIndex] = wordToReverse[rightIndex];
                wordToReverse[rightIndex] = leftChar;
                leftIndex++;
                rightIndex--;
            } else {
                if (!Character.isLetter(wordToReverse[leftIndex])) {
                    leftIndex++;
                }
                if (!Character.isLetter(wordToReverse[rightIndex])) {
                    rightIndex--;
                }
            }
        }

        return String.valueOf(wordToReverse);
    }

    public String getReversedText(String inputText) {
        if (inputText == null || inputText.isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        } else {
            if (inputText.trim().length() == 0)
                return inputText;
            StringJoiner strJoiner = new StringJoiner(DELIMITER);
            String[] words = inputText.split(DELIMITER);
            for (String word : words) {
                strJoiner = word.length() == 1 ? strJoiner.add(word) : strJoiner.add(reverseWord(word.toCharArray()));
            }
            return strJoiner.toString();
        }

    }

}
