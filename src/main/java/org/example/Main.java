package org.example;

import java.util.Arrays;

public class Main {
    int arr[] = new int[10];

    public static void main(String[] args) throws InterruptedException {
     int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
     int start =0;
     int end= arr.length;
     int answer =0;
    int mid = (0+arr.length)/2;

       ThreadSum threadSum1 = new ThreadSum(arr,start,mid,answer);
        ThreadSum threadSum2 = new ThreadSum(arr,mid+1,end,answer);
        Thread t1 = new Thread(threadSum1);
        Thread t2= new Thread(threadSum2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        int totalSum = threadSum1.getAnswer() + threadSum2.getAnswer();

        System.out.println("Total Sum: " + totalSum);

      

    }

}