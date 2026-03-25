package org.example.threadpractice;

public class J extends  Thread{

    public void run(){
        int counter =0;
        while (!isInterrupted()){
            try {
                sleep(1000);
            }catch (InterruptedException ex){
                System.out.println(ex);
                break;
            }
        }

    }
}
