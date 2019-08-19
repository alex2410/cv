package ru.trushkin.cv.tasks.binarysearch;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindMissingNumberSortedInArrayBinaryTest {

    private FindMissingNumberSortedInArrayBinary find = new FindMissingNumberSortedInArrayBinary();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals(4, (int) find.executeExample(List.of(1, 2, 3)));
        Assert.assertEquals(1, (int) find.executeExample(List.of(2, 3)));
        Assert.assertEquals(4, (int) find.executeExample(List.of(1, 2, 3, 5)));
        Assert.assertEquals(3, (int) find.executeExample(List.of(1, 2, 4, 5)));
        Assert.assertEquals(7, (int) find.executeExample(List.of(1, 2, 3, 4, 5, 6, 8)));

        Assert.assertEquals(3, (int) find.executeExample(List.of(1, 2, 4)));
        Assert.assertEquals(2, (int) find.executeExample(List.of(1, 3, 4)));
        Assert.assertEquals(4, (int) find.executeExample(List.of(1, 2, 3, 5, 6, 7)));
        Assert.assertEquals(3, (int) find.executeExample(List.of(1, 2, 4, 5, 6, 7)));
    }
}