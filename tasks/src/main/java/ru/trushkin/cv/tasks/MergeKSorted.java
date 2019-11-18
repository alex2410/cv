package ru.trushkin.cv.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSorted {

    private Queue<HeapWrap> minHeap = new PriorityQueue<>();

    public static void main(String[] args) throws Exception {
        new MergeKSorted().run();
    }

    void run() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        // Scanner s = new Scanner(new InputStreamReader(System.in, " ");
        int count = Integer.parseInt(r.readLine());
        int[][] arrays = new int[count][];
        for (int i = 0; i < count; i++) {
            String[] s = r.readLine().split(" ");
            int c2 = Integer.parseInt(s[0]);
            int[] array = new int[c2];
            for (int k = 1; k < s.length; k++) {
                array[k - 1] = Integer.parseInt(s[k]);
            }
            arrays[i] = array;
        }
        merge(arrays);
    }

    void merge(int[][] arrays) {
        //fill heap
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > 0) {
                minHeap.add(HeapWrap.of(0, i, arrays[i][0]));
            }
        }
        HeapWrap poll = minHeap.poll();
        while (poll != null) {
            System.out.println(poll.value);
            //fillHeap
            int[] array = arrays[poll.arrayIndex];
            if (array.length > poll.index + 1) {
                poll.value = arrays[poll.arrayIndex][poll.index + 1];
                poll.index++;
                minHeap.add(poll);
            }
            poll = minHeap.poll();
        }
    }

    private static class HeapWrap implements Comparable<HeapWrap> {
        int index;
        int arrayIndex;
        int value;

        public static HeapWrap of(int index, int arrayIndex, int value) {
            HeapWrap wrap = new HeapWrap();
            wrap.index = index;
            wrap.arrayIndex = arrayIndex;
            wrap.value = value;
            return wrap;
        }

        @Override
        public int compareTo(HeapWrap o) {
            return value - o.value;
        }
    }
}
