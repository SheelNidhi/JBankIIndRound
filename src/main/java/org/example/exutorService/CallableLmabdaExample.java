package org.example.exutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableLmabdaExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int arr[] = new int[100];
        ExecutorService excutror = Executors.newFixedThreadPool(10);
        for(int i = 0; i < arr.length ;i++) arr[i] = i+1 ;
        int numberOfThreads = 10;
        List<Callable<Integer>> tasks = new ArrayList<>();
        int chunkSize = arr.length /numberOfThreads;
        for( int i = 0; i < numberOfThreads ; i++ ) {
            int start = i * chunkSize;
            int end = (i == numberOfThreads -1 ) ? arr.length : start +chunkSize;
            tasks.add( () -> {
                int sum = 0 ;
                for (int j = start ; j < end ; j++){
                    sum += arr[j];
                }
                return  sum;
            });
        }
        int result = 0;
        for(Future<Integer> future: excutror.invokeAll(tasks)){
            result += future.get();

        }
        for(Future<Integer> future : excutror.invokeAll(tasks)){
            result += future.get();
        }
        System.out.println("res"+result);

    }
}
