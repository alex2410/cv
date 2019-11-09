package ru.trushkin.cv.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a word, return whether some anagram exists that is a palindrome
 */
public class AnagramPalindrome {

    public boolean test(String text) {
        Map<Character, Integer> charCount = new HashMap<>();
        //добавляем все буквы по количеству
        for (int i = 0; i < text.length(); i++) {
            charCount.compute(text.charAt(i), (character, integer) -> integer == null ? 1 : integer + 1);
        }

        //если нечетное количество букв только одно, то можно составить палиндром
        int count = 0;
        for (Integer value : charCount.values()) {
            if (value % 2 == 1) {
                count++;
            }
        }
        return count < 2;
    }

}
