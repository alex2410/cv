package ru.trushkin.cv.algorithms;

public class ArrayBinarySearch {

    public int find(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        int currentIndex;

        while (start <= end) {
            currentIndex = (start + end) / 2;
            if (array[currentIndex] == value) {
                return currentIndex;
            } else if (array[currentIndex] > value) {
                end = currentIndex - 1;
            } else {
                start = currentIndex + 1;
            }
        }
        return -1;
    }
}
