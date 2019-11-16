package ru.trushkin.cv.recursion;

public class BinarySearch {

    public int find(int[] array, int value) {
        return find(array, 0, array.length - 1, value);
    }

    private int find(int[] array, int start, int end, int value) {
        int middle = (start + end) / 2;
        if (middle < 0 || middle >= array.length) {
            return -1;
        }
        if (array[middle] == value) {
            return middle;
        }
        if (start >= end) {
            return -1;
        }
        if (array[middle] < value) {
            return find(array, middle + 1, end, value);
        } else {
            return find(array, start, middle - 1, value);
        }
    }
}
