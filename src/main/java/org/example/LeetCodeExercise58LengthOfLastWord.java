package org.example;

public class LeetCodeExercise58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arrOfStrings = s.split(" ");
        return arrOfStrings[arrOfStrings.length - 1].length();
    }
}
