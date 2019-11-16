package ru.trushkin.cv.recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearchTest {

    @Test
    public void testFind() {
        BinarySearch bs = new BinarySearch();
        Assert.assertEquals(bs.find(new int[]{}, 10), -1);
        Assert.assertEquals(bs.find(new int[]{1}, 10), -1);
        Assert.assertEquals(bs.find(new int[]{1}, 1), 0);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7, 10, 12}, 10), 7);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7}, 7), 6);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7}, 1), 0);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7}, 11), -1);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7}, -11), -1);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7}, 2), 1);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7}, 5), 4);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7}, 4), 3);
        Assert.assertEquals(bs.find(new int[]{1, 2, 3, 4, 5, 6, 7, 10, 12}, 8), -1);

    }
}