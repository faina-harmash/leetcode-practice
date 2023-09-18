package org.example;

public class LeetCodeExercise1TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] resultList = {};

        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target && i < j) {
                    resultList = new int[]{i, j};
                }
            }
        }
        return resultList;

    }

}
