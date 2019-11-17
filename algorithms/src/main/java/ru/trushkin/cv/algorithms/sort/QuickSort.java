package ru.trushkin.cv.algorithms.sort;

public class QuickSort {

    private int[] array;

    public int[] sort(int[] array) {
        this.array = array;
        sort(0, array.length - 1);
        return array;
    }

    private void sort(int start, int end) {
        int size = end - start + 1;
        if (size <= 3) {
            manualSort(start, end);
        } else {
            int median = median(start, end);
            int partition = partition(start, end, median);
            sort(start, partition - 1);
            sort(partition + 1, end);
        }
    }

    private int partition(int start, int end, int median) {
        int left = start;
        int right = end - 1; // там медиана
        while (true) { //сближаемся, пока не найдем элементы которые надо менять
            while (array[++left] < median) ;
            while (array[--right] > median) ;
            if (left >= right) break; //дошли до конца
            swap(left, right); // меняем
        }
        swap(left, end - 1);//переставляем медиану в серидину
        return left;
    }

    private int median(int start, int end) {
        int mid = (end - start) / 2;
        if (array[start] > array[mid]) {
            swap(start, mid);
        }
        if (array[start] > array[end]) {
            swap(start, end);
        }
        if (array[mid] > array[end]) {
            swap(mid, end);
        }
        swap(mid, end - 1);
        return array[end - 1];
    }

    private void swap(int i, int i2) {
        if (i == i2) return;
        array[i] = array[i] ^ array[i2];
        array[i2] = array[i] ^ array[i2];
        array[i] = array[i] ^ array[i2];
    }

    private void manualSort(int start, int end) {
        int size = end - start + 1;
        if (size <= 1) return;
        if (size == 2) {
            if (array[start] > array[end]) {
                swap(start, end);
            }
        } else {
            median(start, end);
        }
    }
}
