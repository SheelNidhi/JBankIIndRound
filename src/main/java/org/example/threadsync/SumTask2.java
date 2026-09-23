package org.example.threadsync;

import java.util.concurrent.Callable;

public class SumTask2 implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        long sum = 0;
        for(int i =0 ; i < 100;i++){
            sum += i;

        }
        return sum;
    }
}
