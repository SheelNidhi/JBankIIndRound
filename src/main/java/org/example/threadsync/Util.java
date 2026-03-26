package org.example.threadsync;

public class Util {
    static void sleep(long mills){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
