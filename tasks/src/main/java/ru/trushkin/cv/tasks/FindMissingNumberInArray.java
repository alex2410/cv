package ru.trushkin.cv.tasks;

import ru.trushkin.cv.runner.ExampleRunner;

import java.util.List;

/**
 * Дана последовательность чисел от 1 до N, в которой одно число пропущено.
 * Например, для N = 5: 1 3 4 5 (пропущено 2).
 */
public class FindMissingNumberInArray implements ExampleRunner<Integer, List<Integer>> {
    @Override
    public Integer executeExample(List<Integer> params) {
        boolean zero = params.get(0) == 0;
        if (!zero && params.get(0) != 1) {
            return 1;
        }
        for (int i = 1; i < params.size(); i++) {
            if (!params.get(i).equals(params.get(i - 1) + 1)) {
                return params.get(i) - 1;
            }
        }
        return zero ? params.size() : params.size() + 1;
    }
}
