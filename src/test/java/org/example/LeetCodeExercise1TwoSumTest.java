package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise1TwoSumTest {

    LeetCodeExercise1TwoSum leetCodeExercise;

    @BeforeEach
    void init() {
        leetCodeExercise = new LeetCodeExercise1TwoSum();
    }

    @Test
    void test() {
        int[] ints = leetCodeExercise.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, ints);
    }

    @Test
    void test2() {
        int[] ints = leetCodeExercise.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, ints);
    }

    @Test
    void test3() {
        int[] ints = leetCodeExercise.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, ints);
    }

}