package org.example;

public class LeetCodeExercise9Palindrome {
    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        for (int i = 0; i < y.length(); i++) {
            char begin = y.charAt(i);
            char end = y.charAt(y.length() - 1 - i);
            if (begin != end) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
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
