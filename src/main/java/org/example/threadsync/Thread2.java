package org.example.threadsync;

public class Thread2 extends  Thread{
    Shared s1;
    public Thread2(Shared s1){
        this.s1 =s1;

    }
    public void  run(){
        s1.test2();
    }

}
