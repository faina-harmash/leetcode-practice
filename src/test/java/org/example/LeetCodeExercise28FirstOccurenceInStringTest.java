package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise28FirstOccurenceInStringTest {
    LeetCodeExercise28FirstOccurenceInString firstOccurenceInString;

    @BeforeEach
    void init() {
        firstOccurenceInString = new LeetCodeExercise28FirstOccurenceInString();
    }

    @Test
    void test() {
        String commonInputString = "sadbutsad";
        String inputString = "sad";
        int expectedResult = 0;
        int actualResult = firstOccurenceInString.strStr(commonInputString, inputString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2() {
        String commonInputString = "leetcode";
        String inputString = "leeto";
        int expectedResult = -1;
        int actualResult = firstOccurenceInString.strStr(commonInputString, inputString);
        assertEquals(expectedResult, actualResult);
    }

}