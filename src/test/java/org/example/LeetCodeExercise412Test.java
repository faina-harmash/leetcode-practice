package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise412Test {
    LeetCodeExercise412 leetCodeExercise;

    @BeforeEach
    void init() {
        leetCodeExercise = new LeetCodeExercise412();
    }

    @Test
    void test() {
        List<String> strings = leetCodeExercise.fizzBuzz(5);
        List<String> expectedList = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expectedList, strings);
    }

    @Test
    void test2() {
        List<String> strings = leetCodeExercise.fizzBuzz(3);
        List<String> expectedList = List.of("1", "2", "Fizz");
        assertEquals(expectedList, strings);
    }

    @Test
    void test3() {
        List<String> strings = leetCodeExercise.fizzBuzz(15);
        List<String> expectedList = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expectedList, strings);
    }

}