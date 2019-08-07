package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindMissingNumberInArrayTest {

    private FindMissingNumberInArray find = new FindMissingNumberInArray();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals(4, (int) find.executeExample(List.of(1, 2, 3)));
        Assert.assertEquals(1, (int) find.executeExample(List.of(2, 3)));
        Assert.assertEquals(4, (int) find.executeExample(List.of(1, 2, 3, 5)));
        Assert.assertEquals(7, (int) find.executeExample(List.of(1, 2, 3, 4, 5, 6, 8)));

        Assert.assertEquals(4, (int) find.executeExample(List.of(0, 1, 2, 3)));
        Assert.assertEquals(1, (int) find.executeExample(List.of(0, 2, 3)));
        Assert.assertEquals(4, (int) find.executeExample(List.of(0, 1, 2, 3, 5)));
    }
}