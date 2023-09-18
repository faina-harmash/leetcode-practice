package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise58LengthOfLastWordTest {
    LeetCodeExercise58LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void init() {
        lengthOfLastWord = new LeetCodeExercise58LengthOfLastWord();
    }

    @Test
    void test() {
        String inputString = "Hello World";
        int expectedResult = 5;
        int actualResult = lengthOfLastWord.lengthOfLastWord(inputString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2() {
        String inputString = "   fly me   to   the moon  ";
        int expectedResult = 4;
        int actualResult = lengthOfLastWord.lengthOfLastWord(inputString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test3() {
        String inputString = "luffy is still joyboy";
        int expectedResult = 6;
        int actualResult = lengthOfLastWord.lengthOfLastWord(inputString);
        assertEquals(expectedResult, actualResult);
    }


}