package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramPalindromeTest {

    AnagramPalindrome anagramPalindrome = new AnagramPalindrome();

    @Test
    public void testTest() {
        Assert.assertTrue(anagramPalindrome.test("mm"));
        Assert.assertTrue(anagramPalindrome.test("mom"));
        Assert.assertTrue(anagramPalindrome.test("mooom"));
        Assert.assertTrue(anagramPalindrome.test("carrace"));
        Assert.assertFalse(anagramPalindrome.test("cutoo"));
        Assert.assertFalse(anagramPalindrome.test("ab"));
    }
}