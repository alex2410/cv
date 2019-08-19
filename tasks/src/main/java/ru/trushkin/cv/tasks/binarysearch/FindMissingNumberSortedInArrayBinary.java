package ru.trushkin.cv.tasks.binarysearch;

import ru.trushkin.cv.runner.ExampleRunner;

import java.util.List;

/**
 * Дана последовательность чисел от 1 до N, в которой одно число пропущено. Используем бинарный поиск
 * Например, для N = 5: 1 3 4 5 (пропущено 2).
 */
public class FindMissingNumberSortedInArrayBinary implements ExampleRunner<Integer, List<Integer>> {
    @Override
    public Integer executeExample(List<Integer> values) {
        int start = 0;
        int end = values.size() - 1;
        int middle = 0;
        if (values.get(0) != 1) {
            //не хватает в начале
            return 1;
        }
        if (values.get(values.size() - 1) == values.size()) {
            //не хватает в конце
            return values.size() + 1;
        }
        while (end - start > 1) {
            middle = (end + start) / 2;
            if ((values.get(start) - start) != (values.get(middle) - middle)) {
                //берем левую часть
                end = middle;
            } else if ((values.get(end) - end) != (values.get(middle) - middle)) {
                //берем правую часть
                start = middle;
            }
        }
        if (middle - start == 1) {
            //между middle и start отсутствует значение
            return values.get(start) + 1;
        }
        if (end - middle == 1) {
            //между middle и end отсутствует значение
            return values.get(middle) + 1;
        }
        throw new IllegalStateException("Nothing to do here");
    }
}
