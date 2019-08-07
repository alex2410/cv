package ru.trushkin.cv.recursion;

import ru.trushkin.cv.runner.ExampleRunner;

/**
 * Фибоначи
 */
public class Fibonacci implements ExampleRunner<String, Integer> {

    @Override
    public String executeExample(Integer count) {
        if (count <= 0) {
            return "";
        }
        if (count == 1) {
            return "1";
        } else if (count == 2) {
            return "1 1";
        }
        StringBuilder sb = new StringBuilder("1 1");
        fibonacci(1, 2, count - 2, sb);
        return sb.toString();
    }

    private void fibonacci(int previous, int current, int count, StringBuilder accumulator) {
        if (count == 0) {
            return;
        }
        accumulator.append(" ").append(current);
        fibonacci(current, current + previous, count - 1, accumulator);
    }
}
