package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeetCodeExercise217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        IntStream initialArray = Arrays.stream(nums);
        IntStream newArray = Arrays.stream(nums).distinct();

        long initArraySize = initialArray.count();
        long newArraySize = newArray.count();
        return initArraySize != newArraySize;
    }
}
