package org.example;

import java.util.*;

public class LeetCodeExerciseMedium139WordBreak {
    //"cats", "dog", "sand", "and", "cat"


    public boolean wordBreakF(String s, List<String> wordDict) {

        List<String> possibleWords = new ArrayList<>();
        List<String> cuttedWords = new ArrayList<>();
        cuttedWords.add(s);

        while (!cuttedWords.isEmpty()) {
            List<String> cuttedWordsIter = new ArrayList<>();
            for (String cuttedWord : cuttedWords) {

                for (String str : wordDict) {

                    if (cuttedWord.startsWith(str)) {
                        possibleWords.add(str);
                        cuttedWordsIter.add(cuttedWord.substring(str.length()));


                    }
                }
            }
            cuttedWords = cuttedWordsIter;
            System.out.println("Cutted - " + cuttedWords);
        }


        System.out.println(possibleWords);


        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(s);

        while (!queue.isEmpty()) {
            String element = queue.poll();
            if (element.isEmpty()) {
                return true;
            }
            for (String str : wordDict) {
                if (element.startsWith(str)) {
                    String candidate = element.substring(str.length());
                    if (!queue.contains(candidate)) {
                        queue.offer(candidate);
                    }
                }
            }
            //System.out.println("%s %s".formatted(queue, queue.size()));
        }
        return false;
    }




    public boolean wordBreak3(String s, List<String> wordDict) {
        List<String> candidates = List.of(s);
        while (!candidates.isEmpty() && !candidates.contains("")) {
            List<String> nextIterCandidates = new ArrayList<>();
            for (String candidate : candidates) {
                for (String word : wordDict) {
                    if (candidate.startsWith(word)) {
                        nextIterCandidates.add(candidate.substring(word.length()));
                    }
                }
            }
            candidates = nextIterCandidates;
        }

        if (candidates.isEmpty()) {
            return false;
        }
        return true;
    }
}
