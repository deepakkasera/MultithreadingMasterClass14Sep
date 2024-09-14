package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!, Printed by : " + Thread.currentThread().getName());

        System.out.println("There's a Scaler Masterclass on concurrency");

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        System.out.println("I'm teaching multithreading in Java");
    }
}