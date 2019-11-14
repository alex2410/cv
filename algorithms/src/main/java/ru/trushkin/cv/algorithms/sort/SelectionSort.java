package ru.trushkin.cv.algorithms.sort;

public class SelectionSort {

    public void sort(int[] array) {
        int minIndex = -1;
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                array[i] = array[i] ^ array[minIndex];
                array[minIndex] = array[i] ^ array[minIndex];
                array[i] = array[i] ^ array[minIndex];
            }
        }
    }
}
