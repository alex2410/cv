package ru.trushkin.cv.tasks;

import ru.trushkin.cv.runner.ExampleRunner;

import java.util.List;

/**
 * Дана последовательность чисел от 1 до N, в которой одно число пропущено.
 * Например, для N = 5: 1 4 3 5 (пропущено 2).
 */
public class FindMissingNumberInArray implements ExampleRunner<Integer, List<Integer>> {

    @Override
    public Integer executeExample(List<Integer> values) {
        int count = values.size() + 1;
        int sum = count * (count + 1) / 2;
        for (Integer value : values) {
            sum = sum - value;
        }
        return sum;
    }
}
