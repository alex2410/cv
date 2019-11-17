package ru.trushkin.cv.algorithms;

public class FastPow {

    public int pow(int value, int n) {
        if (value == 0) {
            return 1;
        }
        if (n == 1) {
            return value;
        }
        boolean needMultiply = n % 2 == 1;
        int cv = pow(value * value, n / 2);
        return needMultiply ? cv * value : cv;
    }
}
