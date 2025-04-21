package forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * nth fibonacci
 */
public class FibonacciTask extends RecursiveTask<Integer> {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int res = pool.invoke(new FibonacciTask(5));
        System.out.println(res);
    }

    private int n;

    public FibonacciTask(int n) {
        this.n = n;
    }


    @Override
    protected Integer compute() {
        if (n <= 1) return 1;

        FibonacciTask t1 = new FibonacciTask(n - 1);
        FibonacciTask t2 = new FibonacciTask(n - 2);

        t2.fork();

        return t1.compute() + t2.join();
    }
}
