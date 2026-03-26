package org.example.threadsync.complfuture;

import java.util.concurrent.CompletableFuture;

public class P1 {
    public static void main(String[] args) {
        int arr[] = new int [100];
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync( () -> sum(arr,0,50));
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync( () -> sum(arr,50,100));
        Integer total = completableFuture.thenCombine(completableFuture1,Integer::sum).join();

        System.out.println(total);
    }
    static int sum(int[] arr, int start, int end) {
        int s = 0;
        for (int i = start; i < end; i++) s += arr[i];
        return s;
    }
}
