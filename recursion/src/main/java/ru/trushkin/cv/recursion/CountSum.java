package ru.trushkin.cv.recursion;

import ru.trushkin.cv.runner.ExampleRunner;

/**
 * Сумма цифр числа
 */
public class CountSum implements ExampleRunner<Integer, Integer> {

    @Override
    public Integer executeExample(Integer value) {
        return count(Math.abs(value));
    }

    private Integer count(Integer value) {
        int result = value % 10;
        int newValue = value / 10;
        if (newValue == 0) {
            return result;
        }
        return result + count(newValue);
    }
}
