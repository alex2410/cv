package ru.trushkin.cv.tasks;

import ru.trushkin.cv.runner.ExampleRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters implements ExampleRunner<Integer, String> {
    @Override
    public Integer executeExample(String s) {
        int length = s.length();
        Set<Character> currentWindow = new HashSet<>();
        int max = 0;
        int start = 0;
        int end = 0;
        while (start < length && end < length) {
            if (!currentWindow.contains(s.charAt(end))) {
                //добавляем пока не найдем дубликат
                //текущего элемента нет в текущем окне, увеличиваем на 1
                currentWindow.add(s.charAt(end));
                end++;
                max = Math.max(max, end - start);
            } else {
                //уменьшаем окно пока не выкинем дубликат текущего end
                //есть дубликат, сдвигаем окно на 1
                currentWindow.remove(s.charAt(start++));
            }
        }
        return max;
    }
}
