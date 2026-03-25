package org.example.threadpractice;

public class Manager8 {
    public static void main(String[] args) {
        G g1 = new G();
        g1.startMethod();
        for (int i =1000; i < 2000; i++){
            System.out.println(i);
        }
    }
}
