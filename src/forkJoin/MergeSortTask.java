package forkJoin;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class MergeSortTask extends RecursiveAction {

    private int[] array;
    int left, right;

    public MergeSortTask(int[] array, int left, int right) {
        this.array = array;
        this.left = left;
        this.right = right;
    }

    @Override
    protected void compute() {
        if(left < right) {
            int mid = (left + right) / 2;
            MergeSortTask leftTask = new MergeSortTask(array, left, mid);
            MergeSortTask rightTask = new MergeSortTask(array, mid + 1, right);

            invokeAll(leftTask, rightTask);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
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
}
