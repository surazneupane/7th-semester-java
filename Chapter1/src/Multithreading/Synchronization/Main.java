package Multithreading.Synchronization;

public class Main {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        new Caller(target, "Hello");
        new Caller(target, "Synchronized");
        new Caller(target, "World");
    }
    }
