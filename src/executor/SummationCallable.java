package executor;

import java.util.concurrent.Callable;

public class SummationCallable implements Callable<Integer> {
    private int num1, num2;

    public SummationCallable(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Integer call()  {
        return num1 + num2;
    }
}
