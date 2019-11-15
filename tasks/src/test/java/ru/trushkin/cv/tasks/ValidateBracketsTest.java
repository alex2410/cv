package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateBracketsTest {

    ValidateBrackets brackets = new ValidateBrackets();

    @Test
    public void testValidate() {
        Assert.assertEquals(brackets.validate("(g){}[]"), true);
        Assert.assertEquals(brackets.validate("g({g}[]"), false);
        Assert.assertEquals(brackets.validate("f(){[g]"), false);
        Assert.assertEquals(brackets.validate("f(){}g["), false);
        Assert.assertEquals(brackets.validate("d){}[]"), false);
        Assert.assertEquals(brackets.validate("()g}[]"), false);
        Assert.assertEquals(brackets.validate("s(){}]"), false);
        Assert.assertEquals(brackets.validate("(sd)"), true);
        Assert.assertEquals(brackets.validate("({])"), false);
        Assert.assertEquals(brackets.validate("[]({})"), true);
        Assert.assertEquals(brackets.validate("({[]}){}[]"), true);
        Assert.assertEquals(brackets.validate("({[[][[[][[[]]]]]]}){}[]"), true);
    }
}