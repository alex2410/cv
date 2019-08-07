package ru.trushkin.cv.recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals((int) factorial.executeExample(0), 1);
        Assert.assertEquals((int) factorial.executeExample(3), 6);
        Assert.assertEquals((int) factorial.executeExample(4), 24);
        Assert.assertEquals((int) factorial.executeExample(-4), 24);
        Assert.assertEquals((int) factorial.executeExample(10), 3628800);
    }
}