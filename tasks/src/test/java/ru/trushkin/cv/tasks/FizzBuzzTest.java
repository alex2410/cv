package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testExecuteExample() {
        Assert.assertEquals(fizzBuzz.executeExample(0), "");
        Assert.assertEquals(fizzBuzz.executeExample(3), "1 2 Fizz");
        Assert.assertEquals(fizzBuzz.executeExample(4), "1 2 Fizz 4");
        Assert.assertEquals(fizzBuzz.executeExample(-4), "");
        Assert.assertEquals(fizzBuzz.executeExample(5), "1 2 Fizz 4 Buzz");
        Assert.assertEquals(fizzBuzz.executeExample(6), "1 2 Fizz 4 Buzz Fizz");
        Assert.assertEquals(fizzBuzz.executeExample(15), "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
        Assert.assertEquals(fizzBuzz.executeExample(21), "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz");
    }
}