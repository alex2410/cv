package ru.trushkin.cv.tasks.slidingwindow;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-window-substring/description/
 */
public class MinimumWindowSubstring {

    public String minWindow(String source, String target) {
        if (target.isEmpty() || source.isEmpty()) {
            return "";
        }
        Map<Character, Integer> charsCount = new HashMap<>();
        Map<Character, Integer> remain = new HashMap<>();

        //добавляем в мапу все нужные буквы
        for (int i = 0; i < target.length(); i++) {
            charsCount.put(target.charAt(i), 0);
            remain.compute(target.charAt(i), (character, integer) -> integer == null ? 1 : integer + 1);
        }
        Map<Character, Integer> remainTarget = new HashMap<>(remain);
        int bestStart = 0;
        int bestEnd = 0;
        int slow = 0;
        int fast = 0;
        while (fast < source.length()) {
            Character currentChar = source.charAt(fast);
            //увеличиваем счетчик текущих найденных букв
            Integer count = charsCount.computeIfPresent(currentChar, (character, integer) -> integer + 1);
            if (count != null) {
                //нужная буква
                //уменьшаем текщую необходимость этой буквы
                remain.compute(currentChar, (character, integer) -> integer == 0 ? integer : integer - 1);
            }
            //увеличиваем fast и следующая итерация
            fast++;

            //если все нашли
            if (countCurrentRemain(remain.values()) == 0) {
                //начинаем уменьшат окно
                boolean cutWindow = true;
                while (cutWindow) {
                    //убираем первую букву из окна
                    Integer countSlow = charsCount.computeIfPresent(source.charAt(slow), (character, integer) -> integer - 1);
                    if (countSlow != null) {
                        //убранная буква есть в необходимых, если текущее количество этих букв в окне меньше необходимого, то
                        //добавляем ее в необходимые
                        if (countSlow < remainTarget.get(source.charAt(slow))) {
                            //добавляем букву в текущии необходимые
                            remain.compute(source.charAt(slow), (character, integer) -> integer + 1);
                            //запоминаем лучший результат
                            if (bestEnd == 0 || bestEnd - bestStart > fast - slow) {
                                bestStart = slow;
                                bestEnd = fast;
                            }
                            //выходим из уменьшения окна
                            cutWindow = false;
                        }
                    }
                    slow++;
                }
            }
        }
        if (countCurrentRemain(remain.values()) == 0) {
            bestStart = slow;
            bestEnd = fast;
        } else if (bestEnd == 0) {
            return "";
        }


        return source.substring(bestStart, bestEnd);
    }

    private int countCurrentRemain(Collection<Integer> values) {
        int result = 0;
        for (Integer value : values) {
            result += value;
        }
        return result;
    }
}
