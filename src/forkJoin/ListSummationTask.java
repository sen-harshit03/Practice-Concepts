package forkJoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * [1, 2, 3, 4, 5,6 ] -> 21
 * I want sum -> Integer -> return -> RecursiveTask
 */
public class ListSummationTask extends RecursiveTask<Integer> {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int res = forkJoinPool.invoke(new ListSummationTask(List.of(1, 2, 3, 4, 5, 6)));
        System.out.println(res);
    }
    private final List<Integer> list;

    public ListSummationTask(List<Integer> list) {
        this.list = list;
    }


    @Override
    protected Integer compute() {
        if (list.size() == 1) {
            return list.getFirst();
        }

        int mid = list.size() / 2;
        List<Integer> left = list.subList(0, mid);  // [0, mid)
        List<Integer> right = list.subList(mid, list.size());  // [mid, list.size())

        ListSummationTask t1 = new ListSummationTask(left);
        ListSummationTask t2 = new ListSummationTask(right);

//        t1.fork(); Instead of forking t1, we can utilize t1 for further processing.
        t2.fork(); //  T2 to be executed in a separate thread

        return t1.compute() + t2.join();
//        return t2.join() + t1.compute();  This is similar to executing threads in serial manner,
//        t2.join() will cause t2 thread to wait, then compute will be executed.

    }
}
