package org.example;

public class LeetCodeExercise69Sqrt {
    public int mySqrt2(int x) {
        int result = 0;
        if (x == 0) {
            return result;
        } else if (x == 1) {
            return x;
        } else {
            for (int i = 2; i <= x; i++) {
                if (i * i > x) {
                    result = result + i;
                    break;

                }

            }

            return result - 1;
        }

    }

    public int mySqrt(int x) {
        int a = 289398;
        int b = a*a;
        int result = 0;
        if (x == 0) {
            return result;
        } else if (x == 1) {
            return x;
        } else {
            for (long i = 2; i < x; i++) {
                if (i * i > x) {
                    result = (int)i;
                    break;

                }

            }

            return result - 1;
        }

    }
}
