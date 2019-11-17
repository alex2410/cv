package ru.trushkin.cv.algorithms.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testSort() {
        QuickSort quickSort = new QuickSort();
        Assert.assertEquals(Arrays.toString(quickSort.sort(new int[]{})), "[]");
        Assert.assertEquals(Arrays.toString(quickSort.sort(new int[]{1})), "[1]");
        Assert.assertEquals(Arrays.toString(quickSort.sort(new int[]{1, 2})), "[1, 2]");
        Assert.assertEquals(Arrays.toString(quickSort.sort(new int[]{1, 2, 3, 4})), "[1, 2, 3, 4]");
        Assert.assertEquals(Arrays.toString(quickSort.sort(new int[]{17, 1, 2, 3, 4})), "[1, 2, 3, 4, 17]");
        Assert.assertEquals(Arrays.toString(quickSort.sort(new int[]{3, 2, 1, 5, 4})), "[1, 2, 3, 4, 5]");
        Assert.assertEquals(Arrays.toString(quickSort.sort(new int[]{3, 1})), "[1, 3]");
        Assert.assertEquals(Arrays.toString(quickSort.sort(new int[]{3, 1, 65, 3345, 7, 3, 89, 2, 1, 4, -2})), "[-2, 89, 7, 2, 3, 1, 3, 1, 4, 65, 3345]");
    }
}