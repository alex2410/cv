package ru.trushkin.cv.algorithms.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class InsertionSortTest {

    InsertionSort sort = new InsertionSort();
    @Test
    public void testSort() {
        int[] array = new int[]{2, 5, 2, 7, 9};
        sort.sort(array);
        Assert.assertEquals(array, new int[]{2, 2, 5, 7, 9});

        array = new int[]{-1, 22, 44, 2, 5, 2, 7, 9};
        sort.sort(array);
        Assert.assertEquals(array, new int[]{-1, 2, 2, 5, 7, 9, 22, 44});

        array = new int[]{-1, 33};
        sort.sort(array);
        Assert.assertEquals(array, new int[]{-1, 33});

        array = new int[]{-1};
        sort.sort(array);
        Assert.assertEquals(array, new int[]{-1});
        }
}
