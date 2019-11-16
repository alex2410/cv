package ru.trushkin.cv.recursion;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrintAllAnagramsTest {

    @Test
    public void testPrintAnagrams() {
        PrintAllAnagrams printAllAnagrams = new PrintAllAnagrams();
        System.out.println("empty anagrams:");
        printAllAnagrams.printAnagrams("");
        System.out.println("a anagrams:");
        printAllAnagrams.printAnagrams("a");
        System.out.println("ba anagrams:");
        printAllAnagrams.printAnagrams("ba");
        System.out.println("abc anagrams:");
        printAllAnagrams.printAnagrams("abc");
        System.out.println("abcd anagrams:");
        printAllAnagrams.printAnagrams("abcd");

    }
}