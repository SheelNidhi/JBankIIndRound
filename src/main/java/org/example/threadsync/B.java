package org.example.threadsync;

public class B extends  Thread{
    A a1;
   public B(A a1){
       this.a1 =a1;

    }
    public void run(){
       a1.test1();
    }
}
