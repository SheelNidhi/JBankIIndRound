package org.example.threadpractice;

public class ThreadA extends  Thread{
    public void run(){
        for (int i =1000; i < 2000; i++){
            System.out.println(i);
        }
    }
}
