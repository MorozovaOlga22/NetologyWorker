package org.example;

public class Main {
    public static void main(String[] args) {
        final OnTaskDoneListener listener = System.out::println;
        final OnTaskErrorListener listenerError = System.out::println;

        final Worker worker = new Worker(listener, listenerError);
        worker.start();
    }
}
