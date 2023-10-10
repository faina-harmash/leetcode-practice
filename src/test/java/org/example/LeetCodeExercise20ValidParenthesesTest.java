package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise20ValidParenthesesTest {
    LeetCodeExercise20ValidParentheses validParentheses;

    @BeforeEach
    void init(){
        validParentheses= new LeetCodeExercise20ValidParentheses();
    }

    @Test
    void test(){
        String parentheses = "()";
        assertTrue(validParentheses.isValid(parentheses));
    }

    @Test
    void test2(){
        String parentheses = "()[]{}";
        assertTrue(validParentheses.isValid(parentheses));
    }

    @Test
    void test3(){
        String parentheses = "(]";
        assertFalse(validParentheses.isValid(parentheses));
    }

}