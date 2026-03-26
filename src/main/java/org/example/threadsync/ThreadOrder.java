package org.example.threadsync;

import java.util.concurrent.CompletableFuture;

import static org.example.threadsync.Util.sleep;

public class ThreadOrder {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 50; i++) {
                System.out.println(i);
            }

        });

        Thread t2 = new Thread(() -> {

            for (int i = 50; i < 100; i++) {
                System.out.println("2.getName()" + i);
            }

        });
        t1.start();
       /* try{
            sleep(1000);
        } catch (Exception ex){
            ex.printStackTrace();
        }*/
        t1.join();
        t2.start();
        CompletableFuture.runAsync(() -> {

        }).thenRun(() -> {
            for (int i = 50; i < 100; i++) {
                System.out.println("ii" + i);
            }
        }).join();
        CompletableFuture.runAsync( () -> {

        }).thenRun( () ->{

        }).join();
    }


   // CompletableFuture.runAsync( ())
      //  CompletableFuture.runAsync()

}
