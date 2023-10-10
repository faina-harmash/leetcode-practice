package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise27RemoveElementFromArrayTest {
    LeetCodeExercise27RemoveElementFromArray removeElementFromArray;

    @BeforeEach
    void init() {
        removeElementFromArray = new LeetCodeExercise27RemoveElementFromArray();
    }

    @Test
    void test() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int expectedResult = 2;
        int actualResult = removeElementFromArray.removeElement(nums, val);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}