package org.example.threadsync;

public class Al extends  Thread{
    Shared1 s1,s2;
    public  Al(Shared1 s1, Shared1 s2){
        this.s1 = s1;
        this.s2 =s2;

    }
    public  void run(){
        s1.test1(s2);
    }
}
