package ru.trushkin.cv.tasks.slidingwindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumSubarraysSizeKTest {

    MaximumSubarraysSizeK subarraysSizeK = new MaximumSubarraysSizeK();

    @Test
    public void testMaxSubArraySum() {
        Assert.assertEquals(subarraysSizeK.maxSubArraySum(new int[]{5, 2, -1, 0, 3}, 3), 6);
        Assert.assertEquals(subarraysSizeK.maxSubArraySum(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4), 39);
        Assert.assertEquals(subarraysSizeK.maxSubArraySum(new int[]{0, 20}, 3), -1);
        Assert.assertEquals(subarraysSizeK.maxSubArraySum(new int[]{0, 20, 20}, 3), 40);
        Assert.assertEquals(subarraysSizeK.maxSubArraySum(new int[]{0, 20, 20, 21}, 3), 61);
        Assert.assertEquals(subarraysSizeK.maxSubArraySum(new int[]{22, 20, 20, 21}, 3), 62);
        Assert.assertEquals(subarraysSizeK.maxSubArraySum(new int[]{22, 20, 0, 20, 21}, 3), 42);
        Assert.assertEquals(subarraysSizeK.maxSubArraySum(new int[]{0, 20, 22, 21, 25, 55, 33}, 1), 55);
    }
}