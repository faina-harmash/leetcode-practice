package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LeetCodeExercise137SingleNumberIIITest {
    LeetCodeExercise137SingleNumberIII singleNumberIII;

    @BeforeEach
    void init() {
        singleNumberIII = new LeetCodeExercise137SingleNumberIII();
    }

    @Test
    void test() {
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] expectedValues = new int[]{3, 5};
        int[] actualValues = singleNumberIII.singleNumberIII(nums);
        assertTrue(Arrays.toString(expectedValues).contains(Arrays.toString(actualValues)),
                "result does NOT contain expected values: 3, 5");

    }
    @Test
    void testInAnyOrder() {
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] expectedValues = new int[]{5, 3};
        int[] actualValues = singleNumberIII.singleNumberIII(nums);
        Assertions.assertThat(expectedValues).containsExactlyInAnyOrder(actualValues);


    }

    @Test
    void test2() {
        int[] nums = new int[]{-1,0};
        int[] expectedValues = new int[]{-1,0};
        int[] actualValues = singleNumberIII.singleNumberIII(nums);
        assertTrue(Arrays.toString(expectedValues).contains(Arrays.toString(actualValues)),
                "result does NOT contain expected values: -1,0");

    }

    @Test
    void test3() {
        int[] nums = new int[]{0,1};
        int[] expectedValues = new int[]{0,1};
        int[] actualValues = singleNumberIII.singleNumberIII(nums);
        assertTrue(Arrays.toString(expectedValues).contains(Arrays.toString(actualValues)),
                "result does NOT contain expected values: 0,1");

    }

}