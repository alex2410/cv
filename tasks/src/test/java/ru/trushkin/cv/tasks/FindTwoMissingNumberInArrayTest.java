package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindTwoMissingNumberInArrayTest {

    private FindTwoMissingNumberInArray find = new FindTwoMissingNumberInArray();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals("2, 4", find.executeExample(List.of(1, 3, 6, 5)));
        Assert.assertEquals("5, 8", find.executeExample(List.of(1, 2, 3, 7, 6, 4, 9)));
        Assert.assertEquals("1, 8", find.executeExample(List.of(5, 2, 3, 7, 6, 4, 9)));
    }
}