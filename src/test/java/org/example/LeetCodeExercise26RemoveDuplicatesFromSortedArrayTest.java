package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeetCodeExercise26RemoveDuplicatesFromSortedArrayTest {
    LeetCodeExercise26RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    void init() {
        removeDuplicatesFromSortedArray = new LeetCodeExercise26RemoveDuplicatesFromSortedArray();
    }

    @Test
    void test() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedArrayLength = 5;
        int actualArrayLength = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test
    void test2() {
        int[] nums = new int[]{1,1,2};
        int expectedArrayLength = 2;
        int actualArrayLength = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(expectedArrayLength, actualArrayLength);
    }

}