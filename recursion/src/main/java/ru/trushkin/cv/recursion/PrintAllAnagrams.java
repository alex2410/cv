package ru.trushkin.cv.recursion;

public class PrintAllAnagrams {

    public void printAnagrams(String word) {
        char[] chars = word.toCharArray();
        anagrams(chars, chars.length);
    }

    private void anagrams(char[] chars, int length) {
        if (length == 1) {
            if (chars.length == 1) {
                System.out.println(new String(chars));
            }
            return;
        }
        for (int i = 0; i < length; i++) {
            anagrams(chars, length - 1);
            if (length == 2) {
                System.out.println(new String(chars));
            }
            rotate(chars, length);
        }

    }

    private void rotate(char[] chars, int length) {
        char temp = chars[chars.length - length];
        for (int i = chars.length - length + 1; i < chars.length; i++) {
            chars[i - 1] = chars[i];
        }
        chars[chars.length - 1] = temp;
    }
}
