package org.example.threadpractice;

public class G extends  Thread{
    public void run(){
        for (int i =0; i < 1000; i++){
            System.out.println(i);
        }
    }
    public  void startMethod(){
        start();
    }
}
