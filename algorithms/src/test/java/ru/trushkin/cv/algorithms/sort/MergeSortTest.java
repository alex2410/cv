package ru.trushkin.cv.algorithms.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testSort() {
        MergeSort sort = new MergeSort();
        Assert.assertEquals(Arrays.toString(sort.sort(new int[]{})), "[]");
        Assert.assertEquals(Arrays.toString(sort.sort(new int[]{1})), "[1]");
        Assert.assertEquals(Arrays.toString(sort.sort(new int[]{2, 1})), "[1, 2]");
        Assert.assertEquals(Arrays.toString(sort.sort(new int[]{2, 3, 6, 4, 51})), "[2, 3, 4, 6, 51]");
        Assert.assertEquals(Arrays.toString(sort.sort(new int[]{-1, 2, 3, 6, 4, 51})), "[-1, 2, 3, 4, 6, 51]");
        Assert.assertEquals(Arrays.toString(sort.sort(new int[]{11, 2, 3, 6, 4, 51})), "[2, 3, 4, 6, 11, 51]");
    }
}