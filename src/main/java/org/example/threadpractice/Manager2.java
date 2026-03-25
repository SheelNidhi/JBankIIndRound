package org.example.threadpractice;

public class Manager2 {
    public static void main(String[] args) {
        Thread1 t2 = new Thread1();
        t2.start();
        for (int i =1000; i < 2000; i++){
            System.out.println(i);
        }
    }
}
