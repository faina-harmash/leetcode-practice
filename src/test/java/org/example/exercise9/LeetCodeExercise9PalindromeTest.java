package org.example.exercise9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeExercise9PalindromeTest {
    LeetCodeExercise9Palindrome leetCodeExercise;

    @BeforeEach
    void init() {
        leetCodeExercise = new LeetCodeExercise9PalindromeSolution1();
    }

    @Test
    void test() {
        boolean palindrome = leetCodeExercise.isPalindrome(1221);
        assertTrue(palindrome);
    }

    @Test
    void test2() {
        boolean palindrome = leetCodeExercise.isPalindrome(-121);
        assertFalse(palindrome);
    }

    @Test
    void test3() {
        boolean palindrome = leetCodeExercise.isPalindrome(10);
        assertFalse(palindrome);
    }

    @Test
    void test4() {
        boolean palindrome = leetCodeExercise.isPalindrome(1231);
        assertFalse(palindrome);
    }
}
