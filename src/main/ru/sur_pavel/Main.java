package ru.sur_pavel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.print("Enter string: ");
        String input = main.reader.readLine();
        System.out.println("Anagram(s): " + main.reverseString(input));
    }

    String reverseString(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }
        return String.join(" ", words);
    }

    private String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (!Character.isAlphabetic(charArray[start])) {
                start++;
            } else if (!Character.isAlphabetic(charArray[end])) {
                end--;
            } else {
                char tempChar = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = tempChar;
                start++;
                end--;
            }
        }
        return new String(charArray);
    }
}
