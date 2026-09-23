package org.example.threadpractice;

import java.util.concurrent.ExecutorService;

public class ThredOrderA {
    public static void main(String[] args) {
        Thread t1 = new Thread( () ->{
            for (int i =0; i <1000; i++){
                System.out.println("i"+i);
            }
        });
        t1.start();
      //  ExecutorService executorService = ExecutorService.
    }

}
