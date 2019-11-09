package ru.trushkin.cv.tasks.slidingwindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinimumWindowSubstringTest {

    MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

    @Test
    public void testMinWindow() {
        Assert.assertEquals(minimumWindowSubstring.minWindow("cabwefgewcwaefgcf", "cae"), "cwae");
        Assert.assertEquals(minimumWindowSubstring.minWindow("aa", "aa"), "aa");
        Assert.assertEquals(minimumWindowSubstring.minWindow("aa", ""), "");
        Assert.assertEquals(minimumWindowSubstring.minWindow("", "aa"), "");
        Assert.assertEquals(minimumWindowSubstring.minWindow("aa", "b"), "");
        Assert.assertEquals(minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"), "BANC");
    }
}