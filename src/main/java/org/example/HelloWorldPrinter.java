package org.example;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World!, Printed by : " + Thread.currentThread().getName());

        System.out.println("Today is Sat, 14th Sept, 2024.");
    }
}
