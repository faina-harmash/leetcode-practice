package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCodeExercise151ReverseWordsTest {
    LeetCodeExercise151ReverseWords reverseWords;

    @BeforeEach
    void init() {
        reverseWords = new LeetCodeExercise151ReverseWords();
    }

    @Test
    void test() {
        String inputString = "the sky is blue";
        String expectedString = "blue is sky the";
        String actualString = reverseWords.reverseWords(inputString);
        assertEquals(expectedString, actualString);
    }
    @Test
    void test2() {
        String inputString = "  hello world  ";
        String expectedString = "world hello";
        String actualString = reverseWords.reverseWords(inputString);
        assertEquals(expectedString, actualString);
    }
    @Test
    void test3() {
        String inputString = "a good   example";
        String expectedString = "example good a";
        String actualString = reverseWords.reverseWords(inputString);
        assertEquals(expectedString, actualString);
    }

}