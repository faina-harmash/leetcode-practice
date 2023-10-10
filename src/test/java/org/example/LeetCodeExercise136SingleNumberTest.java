package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise136SingleNumberTest {
    LeetCodeExercise136SingleNumber singleNumber;

    @BeforeEach
    void init() {
        singleNumber = new LeetCodeExercise136SingleNumber();
    }

    @Test
    void test() {
        int[] nums = new int[]{2, 2, 1};
        int expectedValue = 1;
        int actualValue = singleNumber.singleNumber(nums);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    void test2() {
        int[] nums = new int[]{4,1,2,1,2};
        int expectedValue = 4;
        int actualValue = singleNumber.singleNumber(nums);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void test3() {
        int[] nums = new int[]{1};
        int expectedValue = 1;
        int actualValue = singleNumber.singleNumber(nums);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void test4() {
        int[] nums = new int[]{1,1,2,2,3,4,4,5,5,6,6};
        int expectedValue = 3;
        int actualValue = singleNumber.singleNumber(nums);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void test5() {
        char[] letters = new char[]{'a', 'b', 'c', 'a', 'b'};
        int expectedValue = 'c';
        int actualValue = singleNumber.singleCharacter(letters);
        assertEquals(expectedValue, actualValue);
    }


}