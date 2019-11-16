package ru.trushkin.cv.recursion;

public class Trianglecount {

    public int triangle(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + triangle(n - 1);
    }
}
