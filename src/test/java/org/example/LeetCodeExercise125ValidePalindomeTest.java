package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise125ValidePalindomeTest {
    LeetCodeExercise125ValidePalindome validePalindome;

    @BeforeEach
    void init(){
        validePalindome = new LeetCodeExercise125ValidePalindome();
    }
    @Test
    void test(){
        String inputString = "A man, a plan, a canal: Panama";
        boolean actualResult = validePalindome.isPalindrome(inputString);
        assertTrue(actualResult);
    }
    @Test
    void test2(){
        String inputString = "race a car";
        boolean actualResult = validePalindome.isPalindrome(inputString);
        assertFalse(actualResult);
    }

    @Test
    void test3(){
        String inputString = " ";
        boolean actualResult = validePalindome.isPalindrome(inputString);
        assertTrue(actualResult);
    }

}