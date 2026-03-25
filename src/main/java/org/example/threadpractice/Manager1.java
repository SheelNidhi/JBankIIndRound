package org.example.threadpractice;

public class Manager1 {
    public static void main(String[] args) {
        for (int i =0; i < 1000; i++){
            System.out.println(i);
        }
        for (int i =1000; i < 2000; i++){
            System.out.println(i);
        }
    }
}
