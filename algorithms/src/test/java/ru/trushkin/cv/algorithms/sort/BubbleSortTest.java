package ru.trushkin.cv.algorithms.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSort() {
        int[] array = new int[]{2, 5, 2, 7, 9};
        bubbleSort.sort(array);
        Assert.assertEquals(array, new int[]{2, 2, 5, 7, 9});

        array = new int[]{-1, 22, 44, 2, 5, 2, 7, 9};
        bubbleSort.sort(array);
        Assert.assertEquals(array, new int[]{-1, 2, 2, 5, 7, 9, 22, 44});

        array = new int[]{-1, 33};
        bubbleSort.sort(array);
        Assert.assertEquals(array, new int[]{-1, 33});

        array = new int[]{-1};
        bubbleSort.sort(array);
        Assert.assertEquals(array, new int[]{-1});

        array = new int[]{};
        bubbleSort.sort(array);
        Assert.assertEquals(array, new int[]{});
    }
}