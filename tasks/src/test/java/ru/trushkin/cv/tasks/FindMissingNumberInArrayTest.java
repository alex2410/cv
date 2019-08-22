package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindMissingNumberInArrayTest {

    private FindMissingNumberInArray find = new FindMissingNumberInArray();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals(4, (int) find.executeExample(List.of(1, 2, 3, 6, 5)));
        Assert.assertEquals(1, (int) find.executeExample(List.of(2, 3)));
        Assert.assertEquals(4, (int) find.executeExample(List.of(2, 3, 5, 1)));
        Assert.assertEquals(7, (int) find.executeExample(List.of(1, 4, 3, 2, 5, 8, 6)));
    }
}