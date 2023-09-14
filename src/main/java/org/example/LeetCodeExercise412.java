package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeExercise412 {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList();
        String replacementOfIFirst = "FizzBuzz";
        String replacementOfISecond = "Fizz";
        String replacementOfIThird = "Buzz";

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                l.add(replacementOfIFirst);
            } else if (i % 3 == 0) {
                l.add(replacementOfISecond);

            } else if (i % 5 == 0) {
                l.add(replacementOfIThird);
            } else {
                l.add(String.valueOf(i));
            }

        }


        return l;
    }

}

