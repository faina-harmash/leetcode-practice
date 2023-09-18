package org.example.exercise9;

public class LeetCodeExercise9PalindromeSolution1 implements LeetCodeExercise9Palindrome {

    @Override
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
}
