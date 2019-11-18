package ru.trushkin.cv.tasks;

import org.testng.annotations.Test;

public class MergeKSortedTest {

    @Test
    public void testMerge() {
        MergeKSorted mergeKSorted = new MergeKSorted();
        mergeKSorted.merge(new int[][]{
                {2, 26, 64, 88, 96, 96},
                {8, 20, 65, 86},
                {1, 4, 16, 42, 58, 61, 69},
                {84},
        });
        mergeKSorted.merge(new int[][]{
        });
        mergeKSorted.merge(new int[][]{
                {},
                {},
        });
    }
}