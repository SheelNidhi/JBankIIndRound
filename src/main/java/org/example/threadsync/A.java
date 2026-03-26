package org.example.threadsync;

public class A {
    synchronized void test1(){
        for(int i =0; i <1000;i++){
            System.out.println(i);
        }
    }
    synchronized void test2(){
        for(int i =1000; i <2000;i++){
            System.out.println(i);
        }
    }
}
