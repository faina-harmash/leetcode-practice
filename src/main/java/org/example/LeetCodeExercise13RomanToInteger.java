package org.example;

public class LeetCodeExercise13RomanToInteger {
    public int romanToInt(String s) {
        int accumulator = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char currentSym = s.charAt(i);
            char nextSymbol = s.charAt(i + 1);
            int currentSymValue = getCharValue(currentSym);
            int nextSymValue = getCharValue(nextSymbol);
            if (currentSymValue < nextSymValue) {
                accumulator -= getCharValue(currentSym);
            } else {
                accumulator += getCharValue(currentSym);
            }
        }
        accumulator += getCharValue(s.charAt(s.length() - 1));
        return accumulator;
    }

    private int getCharValue(char symbol) {
        return switch (symbol) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> throw new IllegalStateException("Symbol %s not supported".formatted(symbol));
        };
    }
}
