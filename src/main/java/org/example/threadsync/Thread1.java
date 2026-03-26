package org.example.threadsync;

public class Thread1 extends  Thread{
    Shared s1;
   public Thread1(Shared s1){
       this.s1 =s1;

    }
    public void run(){
       s1.test2();
    }
}
