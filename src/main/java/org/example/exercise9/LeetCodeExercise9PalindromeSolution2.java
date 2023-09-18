package org.example.exercise9;

public class LeetCodeExercise9PalindromeSolution2 implements LeetCodeExercise9Palindrome {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String originalString = String.valueOf(x);
        String reversedString = new StringBuilder(originalString)
                .reverse()
                .toString();
        return originalString.equals(reversedString);
    }
}
