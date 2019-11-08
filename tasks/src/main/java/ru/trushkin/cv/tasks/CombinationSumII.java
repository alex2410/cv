package ru.trushkin.cv.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        //что бы убирать повторы и большие значения
        Arrays.sort(candidates);
        helper(result, new ArrayList<>(), 0, target, candidates);
        return result;
    }

    void helper(List<List<Integer>> result, List<Integer> curr, int start, int target, int[] candidates) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        int prev = -1;
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                //убираем большие
                break;
            }
            if (prev != candidates[i]) {
                //добавляем значение в текущих кандидатов
                curr.add(candidates[i]);
                //идем к следующей цифре+ проверке
                helper(result, curr, i + 1, target - candidates[i], candidates);
                //убираем последнюю
                curr.remove(curr.size() - 1);
                //запоминаем, что бы убрать повторяющиеся комбинации
                prev = candidates[i];
            }
        }
    }
}
