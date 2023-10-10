package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise66PlusOneTest {
    LeetCodeExercise66PlusOne plusOne;

    @BeforeEach
    void init() {
        plusOne = new LeetCodeExercise66PlusOne();
    }

    @Test
    void test() {
        int[] inputArray = new int[]{1, 2, 3};
        int[] expectedArray = new int[]{1, 2, 4};

        Assertions.assertArrayEquals(expectedArray, plusOne.plusOne(inputArray));
    }

    @Test
    void test2() {
        int[] inputArray = new int[]{4, 3, 2, 1};
        int[] expectedArray = new int[]{4, 3, 2, 2};

        Assertions.assertArrayEquals(expectedArray, plusOne.plusOne(inputArray));
    }

    @Test
    void test3() {
        int[] inputArray = new int[]{9};
        int[] expectedArray = new int[]{1, 0};

        Assertions.assertArrayEquals(expectedArray, plusOne.plusOne(inputArray));
    }

}