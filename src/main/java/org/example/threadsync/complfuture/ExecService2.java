package org.example.threadsync.complfuture;

import org.example.threadsync.SumTask3;

import java.util.concurrent.*;

public class ExecService2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfThreads = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int numsOfChunks = 100/10;
        int arr[] = new int[100];


            for(int  i = 0; i < arr.length ;i++){
                arr[i] = i+1;

            }
        long result = 0;
            int chunkSize = (int) (Math.ceil((int)arr.length )/numberOfThreads);
        for(int i =0;i< arr.length ;i+=chunkSize){
            int start = i;
            int end = Math.min(i+chunkSize ,arr.length);
            Callable<Long> task = new SumTask3(start,end,arr);
             Future<Long> future =executorService.submit(task);
             result += future.get();

        }
        System.out.println("result"+result);
    }
}
