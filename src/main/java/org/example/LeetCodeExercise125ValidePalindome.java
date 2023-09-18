package org.example;

public class LeetCodeExercise125ValidePalindome {
    public boolean isPalindrome(String s) {
        String resultString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversedString = String.valueOf(new StringBuilder(resultString).reverse());
        return resultString.equals(reversedString);
    }
}
