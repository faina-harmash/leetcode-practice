package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeExercise136SingleNumber {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> buckets = new HashMap<>();
        for (int num : nums) {
            if (buckets.containsKey(num)) {
                int count = buckets.get(num);
                count = count + 1;
                buckets.put(num, count);
            } else {
                buckets.put(num, 1);
            }
        }
        int result = buckets.entrySet()
                .stream()
                .filter(e -> e.getValue().equals(1))
                .map(e -> e.getKey())
                .findAny()
                .get();
        return result;
    }

    public char singleCharacter(char[] letters) {

        Map<Character, Integer> buckets = new HashMap<>();
        for (char letter : letters) {
            if (buckets.containsKey(letter)) {
                int count = buckets.get(letter);
                count = count + 1;
                buckets.put(letter, count);
            } else {
                buckets.put(letter, 1);
            }
        }

        System.out.println(buckets);
        System.out.println(buckets.entrySet());
        char result = buckets.entrySet().stream()
                .filter(e -> e.getValue().equals(1))
                .map(e -> e.getKey())
                .findAny()
                .get();

        return result;
    }

    public int singleNumberDifficult(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ) {
            int j = i + 1;
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            if (j - i == 1) {
                return nums[i];
            }
            i = j;
        }
        return nums[nums.length - 1];
    }
}
