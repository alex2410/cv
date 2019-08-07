package ru.trushkin.cv.recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals("", fibonacci.executeExample(-1));
        Assert.assertEquals("", fibonacci.executeExample(0));
        Assert.assertEquals("1", fibonacci.executeExample(1));
        Assert.assertEquals("1 1", fibonacci.executeExample(2));
        Assert.assertEquals("1 1 2", fibonacci.executeExample(3));
        Assert.assertEquals("1 1 2 3 5", fibonacci.executeExample(5));
        Assert.assertEquals("1 1 2 3 5 8 13 21 34 55", fibonacci.executeExample(10));
        Assert.assertEquals("1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711", fibonacci.executeExample(22));
    }
}