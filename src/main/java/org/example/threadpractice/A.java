package org.example.threadpractice;

public class A extends  Thread{
    public void run(){
        for (int i = 1000; i < 2000; i++) {
            System.out.println(i);
            try{
                Thread.sleep(5000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
