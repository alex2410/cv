package ru.trushkin.cv.algorithms.sort;

public class BubbleSort {

    public void sort(int[] array) {
        //обратный, так как конец уже отсортирован,
        //до 1, так как последний внутренний проход уже отсортировал
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] ^ array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j] ^ array[j + 1];
                }
            }
        }
    }
}
