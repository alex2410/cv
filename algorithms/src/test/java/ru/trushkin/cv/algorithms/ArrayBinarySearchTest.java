package ru.trushkin.cv.algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayBinarySearchTest {

    ArrayBinarySearch arrayBinarySearch = new ArrayBinarySearch();

    @Test
    public void testFind() {
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6, 7}, 2), 1);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6, 7}, 1), 0);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6, 7}, 5), 2);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6, 7}, 6), 3);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6, 7}, 7), 4);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6, 7}, 11), -1);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6, 7}, -11), -1);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6}, -11), -1);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6}, 11), -1);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6}, 4), -1);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6}, 1), 0);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6}, 2), 1);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6}, 5), 2);
        Assert.assertEquals(arrayBinarySearch.find(new int[]{1, 2, 5, 6}, 6), 3);
    }
}