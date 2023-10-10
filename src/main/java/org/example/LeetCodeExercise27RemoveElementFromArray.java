package org.example;

import java.util.Arrays;

public class LeetCodeExercise27RemoveElementFromArray {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                length = length - 1;
                shiftArray(nums, i);
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return length;
    }

    private void shiftArray(int[] nums, int pivotIndex) {
        for (int i = pivotIndex; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

}
