package org.example.threadsync;

public class Manager {
    public static void main(String[] args) {
        Shared s1 = new Shared();
        Shared s2 = new Shared();
        Thread1 t1 = new Thread1(s1);
        Thread2 t2 = new Thread2(s2);
        t1.start();
        t2.start();
    }
}
