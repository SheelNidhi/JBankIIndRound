package org.example.threadsync;

import static java.lang.Thread.sleep;

public class Shared1 {
    synchronized void test1(Shared1 s1){
        System.out.println("test1 begib");
        try{
            sleep(1000);
            s1.test2(this);
            System.out.println("est1 end");
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    synchronized void test2(Shared1 s1){
        System.out.println("test1 begib");
        try{
            sleep(1000);
            s1.test1(this);
            System.out.println("est1 end");
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
