package org.example.threadpractice;

import org.example.Main;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Comp1Future {
    static void example1_supplyAsync() throws Exception,InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Order #101 fetched";
        });

        String result = future.get();   // blocks until done
        System.out.println(result);     // Order #101 fetched
    }




        static void example2_supplyAsync() throws Exception {
            CompletableFuture<Integer> future =
                    CompletableFuture
                            .supplyAsync(() -> "100")   // returns String
                            .thenApply(Integer::parseInt) // convert to Integer
                            .thenApply(n -> n * 2); // multiply

            System.out.println(future.get()); // print result (200)
        }

        static void example3_supplyAsync() throws Exception {
            CompletableFuture<Void> future =
                    CompletableFuture
                            .runAsync(() -> {  // use runAsync for void tasks
                                for (int i = 0; i < 1000; i++) {
                                    System.out.println(i);
                                }
                            })
                            .thenRun(() -> { // no return, so use thenRun
                                for (int i = 1000; i < 2000; i++) {
                                    System.out.println(i);
                                }
                            });

            future.get(); // wait for completion
        }

        public static  void cmpletableFtuture_example4() throws ExecutionException, InterruptedException {
         CompletableFuture<Void> future = CompletableFuture.runAsync( () -> {

             for(int i =2000; i< 2500;i++){
                 System.out.println("i"+i);

             }
         }).thenRun( () -> {
             for(int j = 2500; j <2750 ; j++){
                 System.out.println(j);
             };
         });
         future.get();
        }
    public static void main(String[] args) throws Exception {
        Comp1Future.example3_supplyAsync();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
       Future<Long> future = executorService.submit( () -> {
            long sum = 0;
            for(int i = 0; i <500; i++){
                sum +=i;
            }
            return sum;
        });
       long ans = future.get();
        System.out.println("done"+ans);
    }
    }


