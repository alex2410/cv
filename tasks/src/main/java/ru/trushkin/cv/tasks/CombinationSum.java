package ru.trushkin.cv.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result.clear();
        curr.clear();
        Arrays.sort(candidates);
        helper(0, target, candidates);
        return result;
    }

    void helper(int start, int target, int[] candidates) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                //убираем большие
                break;
            }
            //добавляем значение в текущих кандидатов
            curr.add(candidates[i]);
            //идем к следующей цифре+ проверке
            helper(i, target - candidates[i], candidates);
            //убираем последнюю
            curr.remove(curr.size() - 1);
            //запоминаем, что бы убрать повторяющиеся комбинации
        }
    }
}
