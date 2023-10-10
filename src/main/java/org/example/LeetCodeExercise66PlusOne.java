package org.example;

import java.math.BigInteger;

public class LeetCodeExercise66PlusOne {

    public int[] plusOne(int[] digits) {
        StringBuilder d = new StringBuilder();
        for (int digit : digits) {
            d.append(digit);
        }

        BigInteger b = new BigInteger(d.toString());
        b = b.add(BigInteger.valueOf(1));

        String greaterInt = b.toString();

        int[] resultArr = new int[greaterInt.length()];
        for (int i = 0; i < resultArr.length; i++) {
            String digitString = greaterInt.substring(i, i + 1);
            resultArr[i] = Integer.parseInt(digitString);
        }

        return resultArr;
    }
}
