package com.Multithreading_Exercise;


public class Question1 {
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        final Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    synchronized (lock) {
                        count++;
                        System.out.println("Count incremented to " + count
                                + " by " + Thread.currentThread().getName());
                        try {
                            lock.wait();
                            lock.notify();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (lock) {
                        lock.notify();
                        count++;
                        System.out.println("Count incremented to " + count
                                + " by " + Thread.currentThread().getName());
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();


    }

}
