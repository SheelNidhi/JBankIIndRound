package org.example.threadpractice;

public class Manager11 {
    public static void main(String[] args) {
        new Thread() {
            public void run() {

                for (int i = 1000; i < 2000; i++) {
                    System.out.println(i);
                }


            }

        }.start();

        new Thread(new Runnable() {
            public void run() {

                for (int i = 1000; i < 2000; i++) {
                    System.out.println(i);
                }


            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    System.out.println(i);
                }
            }

        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    System.out.println(i);
                }
            }
        }).start();
        new Thread(){
            public void run(){
                for (int i = 1000; i < 2000; i++) {
                    System.out.println(i);
                }
            }
        }.start();
    }
}

