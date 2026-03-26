package org.example.threadsync;

public class C extends  Thread{
    A a1;
    public C(A a1){
        this.a1 =a1;

    }
    public  void run(){
        a1.test2();
    }
}
