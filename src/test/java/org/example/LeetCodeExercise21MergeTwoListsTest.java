package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeExercise21MergeTwoListsTest {
    LeetCodeExercise21MergeTwoLists mergeTwoLists;

    @BeforeEach
    void init() {
        mergeTwoLists = new LeetCodeExercise21MergeTwoLists();
    }

    @Test
    void test() {
        List<Integer> list1 = Arrays.asList(1, 2, 4);
        List<Integer> list2 = Arrays.asList(1, 3, 4);
        List<Integer> expectedList = Arrays.asList(1, 1, 2, 3, 4, 4);
        //List<Integer> actualList = mergeTwoLists.oneList(list1, list2);
        //assertEquals(expectedList, actualList);
    }

    @Test
    void test2() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of(0);
        List<Integer> expectedList = List.of(0);
        //List<Integer> actualList = mergeTwoLists.oneList(list1, list2);
        //assertEquals(expectedList, actualList);
    }

    @Test
    void test3() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();
        List<Integer> expectedList = List.of();
        //List<Integer> actualList = mergeTwoLists.oneList(list1, list2);
        //assertEquals(expectedList, actualList);
    }

}