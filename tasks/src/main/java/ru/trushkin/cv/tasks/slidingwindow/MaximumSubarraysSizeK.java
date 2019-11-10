package ru.trushkin.cv.tasks.slidingwindow;

/**
 * https://www.geeksforgeeks.org/window-sliding-technique/amp/
 */
public class MaximumSubarraysSizeK {

    public int maxSubArraySum(int[] array, int subLength) {
        int fast = 0;
        int slow = 0;
        int maxSum = -1;
        int currentSum = 0;
        int currentLength = 0;
        while (fast < array.length) {
            if (currentLength < subLength) {
                //добавляем цифры в текущее окно, пока оно меньше чемнужный подмассив
                currentSum += array[fast];
                fast++;
                currentLength++;
            } else {
                //сжимаем окно
                maxSum = Math.max(currentSum, maxSum);
                currentLength--;
                currentSum -= array[slow];
                slow++;
            }
        }
        if (currentLength == subLength) {
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
