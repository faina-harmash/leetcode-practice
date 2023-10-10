package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCodeExerciseMedium139WordBreakTest {
    LeetCodeExerciseMedium139WordBreak medium139WordBreak;

    @BeforeEach
    void init() {
        medium139WordBreak = new LeetCodeExerciseMedium139WordBreak();
    }

    @Test
    void test() {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        Assertions.assertTrue(medium139WordBreak.wordBreak(s, wordDict));
    }

    @Test
    void test2() {
        String s = "applepenapple";
        List<String> wordDict = List.of("apple", "pen");
        Assertions.assertTrue(medium139WordBreak.wordBreak(s, wordDict));
    }

    @Test
    void test3() {
        String s = "catsandog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
        Assertions.assertFalse(medium139WordBreak.wordBreak(s, wordDict));
    }

    @Test
    void test4() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        List<String> wordDict = List.of("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        Assertions.assertTrue(medium139WordBreak.wordBreak(s, wordDict));
    }

}