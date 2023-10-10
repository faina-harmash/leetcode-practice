package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise69SqrtTest {
    LeetCodeExercise69Sqrt sqrt;

    @BeforeEach
    void init() {
        sqrt = new LeetCodeExercise69Sqrt();
    }

    @Test
    void test() {
        int x = 4;
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, sqrt.mySqrt(x));
    }

    @Test
    void test2() {
        int x = 8;
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, sqrt.mySqrt(x));
    }

    @Test
    void test3() {
        int x = 125;
        int expectedResult = 11;
        Assertions.assertEquals(expectedResult, sqrt.mySqrt(x));
    }

    @Test
    void test4() {
        int x = 2;
        int expectedResult = 1;
        Assertions.assertEquals(expectedResult, sqrt.mySqrt(x));
    }

    @Test
    void test5() {
        int x = 0;
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, sqrt.mySqrt(x));
    }

    @Test
    void test6() {
        int x = 1;
        int expectedResult = 1;
        Assertions.assertEquals(expectedResult, sqrt.mySqrt(x));
    }

    @Test
    void test7() {
        int x = 2147395600;
        int expectedResult = 46340;
        Assertions.assertEquals(expectedResult, sqrt.mySqrt(x));
    }

}