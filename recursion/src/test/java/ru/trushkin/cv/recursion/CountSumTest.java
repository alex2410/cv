package ru.trushkin.cv.recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountSumTest {

    private CountSum countSum = new CountSum();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals((int) countSum.executeExample(0), 0);
        Assert.assertEquals((int) countSum.executeExample(1), 1);
        Assert.assertEquals((int) countSum.executeExample(12389), 23);
        Assert.assertEquals((int) countSum.executeExample(-12389), 23);
        Assert.assertEquals((int) countSum.executeExample(1238911), 25);
    }
}