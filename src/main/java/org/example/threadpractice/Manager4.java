package org.example.threadpractice;

public class Manager4 {
    public static void main(String[] args) {
        E e1 = new E();
        Thread t1 = new Thread(e1);
        t1.start();
    }
}
