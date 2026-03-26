package org.example.threadsync;

import org.example.Main;

public class Manager1 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B(a1);
        b1.start();
        C c1 = new C(a1);
        c1.start();
    }
}
