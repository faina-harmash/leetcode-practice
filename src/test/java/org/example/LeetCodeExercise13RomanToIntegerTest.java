package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise13RomanToIntegerTest {
    LeetCodeExercise13RomanToInteger romanToInteger;

    @BeforeEach
    void init() {
        romanToInteger = new LeetCodeExercise13RomanToInteger();
    }

    @Test
    void test() {
        String inputString = "IV";
        int expectedResult = 4;
        int actualResult = romanToInteger.romanToInt(inputString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2() {
        String inputString = "MMD";
        int expectedResult = 2500;
        int actualResult = romanToInteger.romanToInt(inputString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test3() {
        String inputString = "VIII";
        int expectedResult = 8;
        int actualResult = romanToInteger.romanToInt(inputString);

        assertEquals(expectedResult, actualResult);
    }

}