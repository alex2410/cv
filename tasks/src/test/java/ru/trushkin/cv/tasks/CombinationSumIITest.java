package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CombinationSumIITest {

    CombinationSumII combinationSumII = new CombinationSumII();

    @Test
    public void testCombinationSum2() {
        Assert.assertEquals(combinationSumII.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8).toString(), "[[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]");
        Assert.assertEquals(combinationSumII.combinationSum2(new int[]{2,5,2,1,2}, 5).toString(), "[[1, 2, 2], [5]]");
    }
}