package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CombinationSumTest {

    @Test
    public void testCombinationSum2() {
        CombinationSum combinationSum = new CombinationSum();
        Assert.assertEquals(combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7).toString(), "[[2, 2, 3], [7]]");
        Assert.assertEquals(combinationSum.combinationSum(new int[]{2, 3, 5}, 8).toString(), "[[2, 2, 2, 2], [2, 3, 3], [3, 5]]");
    }
}