package org.example.exutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuotrService5 {
    public static void main(String[] args) {
        int numnerOfThread = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int arr[] = new int[100];
        int numberOfchunks = arr.length/ numnerOfThread;
        for ( int i  = 0; i < arr.length ; i +=numberOfchunks){
            int start = i* numberOfchunks;
            int end = (i == numnerOfThread -i -1) ? arr.length : start+numberOfchunks;
            Callable<Integer> task = () -> {
                int  sum = 0;
                for( int j = start ; j < end ; j++){
                    sum +=arr[start];
                }
                return  sum;
            };
            executorService.submit(task);
        }

    }
}
