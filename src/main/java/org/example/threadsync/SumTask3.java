package org.example.threadsync;

import java.util.concurrent.Callable;

public class SumTask3 implements Callable<Long> {
    int start;
    int end;
    int arr[] = new int[100];

    public SumTask3(int start, int end, int[] arr){
        this.start =start;
        this.end = end;
        for(int  i = 0; i < arr.length ;i++){
            arr[i] = i+1;

        }
    }
    @Override
    public Long call() throws Exception {
        long sum = 0;
        for(int i = start; i< end; i++){
            sum +=i;

        }
        return sum;
    }
}
