package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadSumFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;

        int mid = arr.length / 2;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Long> v1 = executorService.submit( new SumTask(arr,0, 5));
        Future<Long> v2 = executorService.submit( new SumTask(arr,5, 10));
        long total = v1.get() + v2.get();

        executorService.shutdown();

        System.out.println("Total Sum: " + total);
    }
}
