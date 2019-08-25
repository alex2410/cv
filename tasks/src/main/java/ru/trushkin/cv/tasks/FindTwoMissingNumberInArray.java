package ru.trushkin.cv.tasks;

import ru.trushkin.cv.runner.ExampleRunner;

import java.util.List;

/**
 * Дана последовательность чисел от 1 до N, в которой два числа пропущено.
 * Например, для N = 5: 1 4 5 (пропущено 2, 3).
 */
public class FindTwoMissingNumberInArray implements ExampleRunner<String, List<Integer>> {

    @Override
    public String executeExample(List<Integer> values) {
        int count = values.size() + 2;
        int sum = count * (count + 1) / 2;
        for (Integer value : values) {
            sum = sum - value;
        }
        int productAll = 1;
        for (int i = 1; i <= count; i++) {
            productAll = productAll * i;
        }
        int productValues = 1;
        for (Integer value : values) {
            productValues = productValues * value;
        }
        int product = productAll / productValues;
       /* a + b = sum;
        a * b = product;
        a = sum - b;
        (sum - b) * b = product;
        b * b + sum * b - product = 0;*/

        int sqrt = (int) Math.sqrt(sum * sum - 4 * product);
        int a = (sum + sqrt) / (2);
        int b = sum - a;

        return b + ", " + a;
    }
}
