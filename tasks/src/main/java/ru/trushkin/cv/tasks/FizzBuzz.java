package ru.trushkin.cv.tasks;

import ru.trushkin.cv.runner.ExampleRunner;

import java.util.stream.IntStream;

/**
 * Classic fizzbuzz
 */
public class FizzBuzz implements ExampleRunner<String, Integer> {

    @Override
    public String executeExample(Integer params) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(1, params + 1).forEach(value -> {
            if (value != 0) {
                if (value % 3 == 0 && value % 5 == 0) {
                    sb.append("FizzBuzz ");
                } else if (value % 3 == 0) {
                    sb.append("Fizz ");
                } else if (value % 5 == 0) {
                    sb.append("Buzz ");
                } else {
                    sb.append(value).append(" ");
                }
            }
        });
        return sb.toString().trim();
    }
}
