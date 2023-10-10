package org.example;

import java.util.Arrays;

public class LeetCodeExercise26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int[] sortedArray =
        Arrays.stream(nums).distinct().toArray();
        int length = sortedArray.length;
        return length;

    }

}
