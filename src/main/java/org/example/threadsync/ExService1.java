package org.example.threadsync;

import java.util.Arrays;
import java.util.concurrent.*;

public class ExService1 {
    public static long getCom() throws ExecutionException, InterruptedException {
        CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(
                () -> 10l).thenApply( x -> x*2);
        return completableFuture.get();

    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int array[] = new int[100];
        ExecutorService excetorService = Executors.newFixedThreadPool(10);
        Runnable r = () -> {
            System.out.println("test");
        };
        excetorService.submit(r);
        Callable call = () -> {
            int i =10;
            return 10;
        };
        ExService1.getCom();

    }
}
