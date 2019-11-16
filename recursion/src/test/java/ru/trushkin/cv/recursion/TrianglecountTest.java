package ru.trushkin.cv.recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TrianglecountTest {

    Trianglecount trianglecount = new Trianglecount();

    @Test
    public void testTriangle() {
        Assert.assertEquals(trianglecount.triangle(0),0);
        Assert.assertEquals(trianglecount.triangle(1),1);
        Assert.assertEquals(trianglecount.triangle(5),15);
        Assert.assertEquals(trianglecount.triangle(7),28);
    }
}