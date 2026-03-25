package org.example.threadpractice;

public class Manager5 {
    public static void main(String[] args) {
        D d1 = new D();
        d1.start();
        for (int i =1000; i < 2000; i++){
            System.out.println(i);
        }
    }
}
