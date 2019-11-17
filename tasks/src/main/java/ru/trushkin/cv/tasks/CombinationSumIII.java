package ru.trushkin.cv.tasks;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public List<List<Integer>> combinationSum(int count, int target) {
        result.clear();
        curr.clear();
        helper(0, count, target, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        return result;
    }

    void helper(int start, int count, int target, int[] candidates) {
        if (target == 0) {
            if (curr.size() != count) {
                return;
            }
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (curr.size() >= count) {
                break;
            }
            if (candidates[i] > target) {
                //убираем большие
                break;
            }
            //добавляем значение в текущих кандидатов
            curr.add(candidates[i]);
            //идем к следующей цифре+ проверке
            helper(i + 1, count, target - candidates[i], candidates);
            //убираем последнюю
            curr.remove(curr.size() - 1);
            //запоминаем, что бы убрать повторяющиеся комбинации
        }
    }
}
