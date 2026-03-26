package org.example.threadsync;

public class Shared {
    void test1(){
        Thread t1 = Thread.currentThread();

            for(int i =0; i <1000;i++){
                System.out.println("test1"+t1.getName()+"."+i);
            }

    }
    void test2(){
        Thread t1 = Thread.currentThread();

        for(int i =0; i <1000;i++){
            System.out.println("test2"+t1.getName()+"."+i);
        }

    }
    synchronized void test3(){
        Thread t1 = Thread.currentThread();

        for(int i =0; i <1000;i++){
            System.out.println("test3"+t1.getName()+"."+i);
        }

    }
    synchronized void test4(){
        Thread t1 = Thread.currentThread();

        for(int i =0; i <1000;i++){
            System.out.println("test4"+t1.getName()+"."+i);
        }

    }
    synchronized void test5(){
        Thread t1 = Thread.currentThread();

        for(int i =0; i <1000;i++){
            System.out.println("test5"+t1.getName()+"."+i);
        }

    }
    synchronized void test6(){
        Thread t1 = Thread.currentThread();

        for(int i =0; i <1000;i++){
            System.out.println("test6"+t1.getName()+"."+i);
        }

    }
    synchronized void test7(){
        Thread t1 = Thread.currentThread();

        for(int i =0; i <1000;i++){
            System.out.println("test7"+t1.getName()+"."+i);
        }

    }
    synchronized void test8(){
        Thread t1 = Thread.currentThread();

        for(int i =0; i <1000;i++){
            System.out.println("test8"+t1.getName()+"."+i);
        }

    }
}
