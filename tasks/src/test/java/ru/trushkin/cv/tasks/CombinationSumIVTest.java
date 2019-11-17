package ru.trushkin.cv.tasks;

import org.testng.annotations.Test;

public class CombinationSumIVTest {

    @Test
    public void testCombinationSum() {
        CombinationSumIV combinationSumIV = new CombinationSumIV();
        System.out.println(combinationSumIV.combinationSum(new int[]{2,1,3},35));

    }
}