package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CombinationSumIIITest {

    @Test
    public void testCombinationSum() {
        CombinationSumIII combinationSumIII = new CombinationSumIII();
        Assert.assertEquals(combinationSumIII.combinationSum(3, 7).toString(), "[[1, 2, 4]]");
        Assert.assertEquals(combinationSumIII.combinationSum(3, 9).toString(), "[[1, 2, 6], [1, 3, 5], [2, 3, 4]]");
    }
}