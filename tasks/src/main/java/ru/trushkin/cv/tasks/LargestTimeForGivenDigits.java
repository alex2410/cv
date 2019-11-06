package ru.trushkin.cv.tasks;

import ru.trushkin.cv.runner.ExampleRunner;

/**
 * https://leetcode.com/problems/largest-time-for-given-digits/solution/
 */
public class LargestTimeForGivenDigits implements ExampleRunner<String, Integer[]> {

    @Override
    public String executeExample(Integer[] params) {
        int largestHour = -1;
        int largestMinutes = -1;
        for (int i = 0; i < params.length; i++) {
            for (int i1 = 0; i1 < params.length; i1++) {
                if (i1 == i) {
                    continue;
                }
                for (int i2 = 0; i2 < params.length; i2++) {
                    if (i2 == i || i1 == i2) {
                        continue;
                    }
                    for (int i3 = 0; i3 < params.length; i3++) {
                        if (i == i3 || i1 == i3 || i2 == i3) {
                            continue;
                        }
                        int currentHours = params[i] * 10 + params[i1];
                        int currentMinutes = params[i2] * 10 + params[i3];
                        if (currentHours > 23 || currentMinutes > 59) {
                            continue;
                        }
                        if (currentHours > largestHour) {
                            largestHour = currentHours;
                            largestMinutes = currentMinutes;
                        } else if (currentHours == largestHour && currentMinutes > largestMinutes) {
                            largestHour = currentHours;
                            largestMinutes = currentMinutes;
                        }
                    }
                }
            }
        }
        if (largestHour == -1) {
            return "";
        }
        String largestHourStr = String.valueOf(largestHour);
        if (largestHourStr.length() == 1) {
            largestHourStr = "0" + largestHourStr;
        }
        String largestMinutesStr = String.valueOf(largestMinutes);
        if (largestMinutesStr.length() == 1) {
            largestMinutesStr = "0" + largestMinutesStr;
        }
        return largestHourStr + ":" + largestMinutesStr;
    }
}
