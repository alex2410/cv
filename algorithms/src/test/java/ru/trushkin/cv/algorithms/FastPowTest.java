package ru.trushkin.cv.algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FastPowTest {

    @Test
    public void testPow() {
        FastPow fastPow = new FastPow();
        Assert.assertEquals(fastPow.pow(1, 1), Math.pow(1, 1));
        Assert.assertEquals(fastPow.pow(0, 0), Math.pow(0, 0));
        Assert.assertEquals(fastPow.pow(-1, 2), Math.pow(-1, 2));
        Assert.assertEquals(fastPow.pow(2, 10), Math.pow(2, 10));
        Assert.assertEquals(fastPow.pow(2, 11), Math.pow(2, 11));
        Assert.assertEquals(fastPow.pow(3, 11), Math.pow(3, 11));
        Assert.assertEquals(fastPow.pow(3, 10), Math.pow(3, 10));
    }
}