package ru.trushkin.cv.recursion;

import ru.trushkin.cv.runner.ExampleRunner;

/**
 * Факториал
 */
public class Factorial implements ExampleRunner<Integer, Integer> {

    @Override
    public Integer executeExample(Integer value) {
        return factorial(Math.abs(value));
    }

    private Integer factorial(int value) {
        if (value == 1 || value == 0) {
            return 1;
        }
        return factorial(value - 1) * value;
    }
}
