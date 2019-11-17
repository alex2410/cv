package ru.trushkin.cv.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIV {

    int result = 0;
    private int[] candidates;

    public int combinationSum(int[] nums, int target) {
        result = 0;
        Arrays.sort(nums);
        candidates = nums;
        helper(0, target);
        return result;
    }

    void helper(int start, int target) {

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                //убираем большие
                break;
            }
            //идем к следующей цифре+ проверке
            if (target - candidates[i] == 0) {
                result++;
            } else {
                helper(0, target - candidates[i]);
            }
        }
    }
}
