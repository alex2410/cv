package ru.trushkin.cv.algorithms.sort;

public class InsertionSort {

    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            //перемещаем элемент влево
            for (int j = i-1; j >= 0; j--) {
                if(array[j] > temp){
                    //сдвигаем вправо элемент
                    array[j+1] = array[j];
                } else if(j == i-1) {
                    //элемент сразу на позиции, сдвигов не надо
                  break;
                } else {
                    //нашли место
                    array[j+1] = temp;
                    break;
                }
            }
        }
    }
}
