package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise217ContainsDuplicateTest {

    LeetCodeExercise217ContainsDuplicate leetCodeExercise;

    @BeforeEach
    void init() {
        leetCodeExercise = new LeetCodeExercise217ContainsDuplicate();
    }

    @Test
    void test() {
        int inputData[] = new int[]{1, 2, 3, 1};
        boolean containsDuplicate = leetCodeExercise.containsDuplicate(inputData);
        assertTrue(containsDuplicate);
    }

    @Test
    void test2() {
        int inputData[] = new int[]{1, 2, 3, 4};
        boolean containsDuplicate = leetCodeExercise.containsDuplicate(inputData);
        assertFalse(containsDuplicate);
    }

    @Test
    void test3() {
        int inputData[] = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean containsDuplicate = leetCodeExercise.containsDuplicate(inputData);
        assertTrue(containsDuplicate);
    }

}