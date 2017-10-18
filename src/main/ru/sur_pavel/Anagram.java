package ru.sur_pavel;

public class Anagram {
    public String reverseString(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }
        return String.join(" ", words);
    }

    private String reverseWord(String word) {
        char[] wordChars = word.toCharArray();

        for (int start = 0, end = wordChars.length - 1; start < end; ) {
            if (!Character.isAlphabetic(wordChars[start])) {
                start++;
            } else if (!Character.isAlphabetic(wordChars[end])) {
                end--;
            } else {
                char tempChar = wordChars[start];
                wordChars[start] = wordChars[end];
                wordChars[end] = tempChar;
                start++;
                end--;
            }
        }
        return new String(wordChars);
    }
}
