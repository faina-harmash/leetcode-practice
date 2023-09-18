package org.example;

import java.util.Arrays;
import java.util.List;

public class LeetCodeExercise151ReverseWords {
    public String reverseWords1(String s) {
        String inputString = s.trim();
        String reversedString = String.valueOf(new StringBuilder(inputString).reverse());
        String[] arr = reversedString.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()){
                arr[i] = String.valueOf(new StringBuilder(arr[i]).reverse());
                result = result + arr[i] + " ";
            }

        }
        return result.trim();
    }

    public String reverseWords(String s) {
        String normalizedString = s.replaceAll("\\s+", " ")
                .trim();
        String[] words = normalizedString.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }
        return result.trim();
    }
}
