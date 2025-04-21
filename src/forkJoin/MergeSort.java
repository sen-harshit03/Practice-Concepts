package forkJoin;


import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 *  A thread pool designed to handle divide-and-conquer tasks.
 *  Fork -> Keep dividing the task into sub tasks, until it can be performed by a single thread concurrently.
 *  Join -> Combine the result of the sub-tasks
 *
 *
 *  Works on WORK STEALING ALGO
 *  Idle threads steal the work of other busy threads to improve load balancing and performance.
 *
 *  Two types of task:
 *  1. RecursiveTask: Task returns a result
 *  2. RecursiveAction: Task doesn't return a result (just performs the actions)
 */
public class MergeSort {

    public static void main(String[] args) {
        int size = 10_000_000;
        int[] serialArray = generateRandomArray(size);
        int[] parallelArray = Arrays.copyOf(serialArray, serialArray.length);

        // Measure serial time
        long serialStartTime = System.nanoTime();
        serialMergeSort(serialArray);
        long serialEndTime = System.nanoTime();
        long serialDuration = serialEndTime - serialStartTime;

        System.out.println("Serial Merge Sort took: " + serialDuration / 1_000_000.0 + " milliseconds"); // 3525

        // Measure time for parallel merge sort
        long parallelStartTime = System.nanoTime();
        mergeSortParallel(parallelArray);
        long parallelEndTime = System.nanoTime();
        long parallelDuration = parallelEndTime - parallelStartTime;
        System.out.println("Parallel Merge Sort took: " + parallelDuration / 1_000_000.0 + " milliseconds"); // 1195 (almost 3x)

    }

    private static void serialMergeSort(final int[] serialArray) {
        mergeSortSerial(serialArray, 0, serialArray.length - 1);
    }

    private static void mergeSortParallel(final int[] array) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new MergeSortTask(array, 0, array.length - 1));
    }

    private static void mergeSortSerial(int[] array, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSortSerial(array, left, mid);
            mergeSortSerial(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int start = left;
        int end = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];

        while (start <= mid && end <= right) {
            if(array[start] <= array[end]) {
                temp[k++] = array[start++];
            } else {
                temp[k++] = array[end++];
            }
        }

        while (start <= mid) {
            temp[k++] = array[start++];
        }

        while (end <= right) {
            temp[k++] = array[end++];
        }

        System.arraycopy(temp, 0, array, left, temp.length);
    }

    private static int[] generateRandomArray(final int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100000); // Random number up to 100000
        }
        return array;
    }
}
