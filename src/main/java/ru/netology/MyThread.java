package ru.netology;

public class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println(" >>>>>> " + getName() + " thread started!");
        while (!isInterrupted()) {
            System.out.println(getName() + " thread is working " + (System.currentTimeMillis() - start) + " millis! ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " thread is interrupted in a sleep period, after " + (System.currentTimeMillis() - start) + " millis. ");
                return;
            }
        }
    }
}
