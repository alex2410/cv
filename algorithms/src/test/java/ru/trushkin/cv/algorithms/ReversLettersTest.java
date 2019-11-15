package ru.trushkin.cv.algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReversLettersTest {

    ReversLetters reversLetters = new ReversLetters();

    @Test
    public void testReverse1() {
        Assert.assertEquals(reversLetters.reverse1("qwerty"), "ytrewq");
        Assert.assertEquals(reversLetters.reverse1("qwert"), "trewq");
        Assert.assertEquals(reversLetters.reverse1("q"), "q");
        Assert.assertEquals(reversLetters.reverse1(""), "");
    }

    @Test
    public void reverseWithStack() {
        Assert.assertEquals(reversLetters.reverseWithStack("qwerty"), "ytrewq");
        Assert.assertEquals(reversLetters.reverse1("qwert"), "trewq");
        Assert.assertEquals(reversLetters.reverseWithStack("q"), "q");
        Assert.assertEquals(reversLetters.reverseWithStack(""), "");
    }
}