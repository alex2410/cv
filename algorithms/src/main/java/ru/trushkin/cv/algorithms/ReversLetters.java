package ru.trushkin.cv.algorithms;

import ru.trushkin.cv.structures.Stack;

public class ReversLetters {

    public String reverse1(String text) {
        if (text.length() == 0) {
            return "";
        }
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length() / 2; i++) {
            chars[i] = (char) (chars[i] ^ chars[text.length() - 1 - i]);
            chars[text.length() - 1 - i] = (char) (chars[i] ^ chars[text.length() - 1 - i]);
            chars[i] = (char) (chars[i] ^ chars[text.length() - 1 - i]);
        }
        return new String(chars);
    }

    public String reverseWithStack(String text) {
        Stack<Character> stack = new Stack<>(text.length());
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }
        while (stack.hasElement()) {
            result += stack.pop();
        }

        return result;
    }
}
