package org.example.exutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorservice4 {
    public static void main(String[] args) {
        int numberOfThreads = 2;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Long> task1 = () -> {
            int sum  =0;
            for(int i = 0 ;i < 50 ; i++){
                sum += i;
            }
            return  (long)sum;
        };
    }
}
