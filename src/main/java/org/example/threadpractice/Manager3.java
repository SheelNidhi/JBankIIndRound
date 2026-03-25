package org.example.threadpractice;

public class Manager3 {
    public static void main(String[] args) {
        C c1= new C();
       Thread t1 = new Thread(c1);
       t1.start();
    }
}
