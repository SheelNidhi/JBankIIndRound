package org.example.threadsync;

public class Bl extends Thread {
    Shared1 s1,s2;
    public  Bl(Shared1 s1, Shared1 s2){
        this.s1 = s1;
        this.s2 =s2;

    }
    public  void run(){
        s2.test1(s1);
    }
}

