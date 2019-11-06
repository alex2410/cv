package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LargestTimeForGivenDigitsTest {

    LargestTimeForGivenDigits object = new LargestTimeForGivenDigits();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals(object.executeExample(new Integer[]{0, 4, 0, 0}), "04:00");
        Assert.assertEquals(object.executeExample(new Integer[]{5, 5, 5, 5}), "");
        Assert.assertEquals(object.executeExample(new Integer[]{0, 0, 0, 0}), "00:00");
        Assert.assertEquals(object.executeExample(new Integer[]{0, 0, 3, 0}), "03:00");
        Assert.assertEquals(object.executeExample(new Integer[]{1, 2, 3, 4}), "23:41");
    }
}