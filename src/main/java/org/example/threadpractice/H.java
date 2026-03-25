package org.example.threadpractice;

public class H extends  Thread{
    public H(){
        start();
    }
    public void run(){

                for (int i =0; i < 1000; i++){
                    System.out.println(i);
                }


    }
}
