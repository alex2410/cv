package ru.trushkin.cv.structures;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StackTest {

    @Test
    public void testStack() {
        Stack<Integer> stack = new Stack<>(3);
        stack.push(1);
        Assert.assertEquals(stack.peek(), Integer.valueOf(1));
        stack.push(2);
        Assert.assertEquals(stack.peek(), Integer.valueOf(2));
        stack.push(3);
        Assert.assertEquals(stack.peek(), Integer.valueOf(3));
        Assert.assertEquals(stack.pop(), Integer.valueOf(3));
        Assert.assertEquals(stack.pop(), Integer.valueOf(2));
        Assert.assertEquals(stack.pop(), Integer.valueOf(1));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testException() {
        Stack<Integer> stack = new Stack<>(1);
        stack.push(1);
        stack.push(2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testException2() {
        Stack<Integer> stack = new Stack<>(1);
        stack.pop();
    }
}