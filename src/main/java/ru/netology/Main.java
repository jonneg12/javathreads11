package ru.netology;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating threads...");

        //create group of thread
        ThreadGroup threadGroup = new ThreadGroup("Thread group");

        //create threads with group and name
        Thread thread1 = new MyThread(threadGroup, "First");
        Thread thread2 = new MyThread(threadGroup, "Second");
        Thread thread3 = new MyThread(threadGroup, "Third");
        Thread thread4 = new MyThread(threadGroup, "Fourth");

        //start threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        //set delay time for main thread working
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }

        //stop all threads
        threadGroup.interrupt();
        System.out.println("All threads are interrupted successfully.");
    }
}
