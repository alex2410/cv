package ru.trushkin.cv.recursion;

import java.util.Arrays;

public class MergeSort {

    int[] subArray = null;

    public int[] sort(int[] array) {
        subArray = Arrays.copyOf(array, array.length);
        sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(array, start, mid);
        sort(array, mid + 1, end);
        merge(array, start, mid + 1, end);
    }

    private void merge(int[] array, int start1, int start2, int end) {
        int i = 0;
        int start = start1;
        int mid = start2 - 1;
        int size = end - start + 1;
        while (start1 <= mid && start2 <= end) {
            if (array[start1] < array[start2]) {
                subArray[i++] = array[start1++];
            } else {
                subArray[i++] = array[start2++];
            }
        }
        while (start1 <= mid) {
            subArray[i++] = array[start1++];
        }
        while (start2 <= end) {
            subArray[i++] = array[start2++];
        }
        for (int j = 0; j < size; j++) {
            array[start + j] = subArray[j];
        }

    }
}
