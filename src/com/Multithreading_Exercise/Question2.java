package com.Multithreading_Exercise;


class PrimeNum implements Runnable {

    @Override
    public void run() {
        int no;
        for (no = 2; no <= 10; no++) {
            int count = 0;
            for (int i = 2; i <= no / 2; i++)
                if (no % i == 0) {
                    count++;
                    break;
                }
            if (count == 0)
                System.out.println(no + " Number is prime");
        }
    }
}


class NonPrimeNum implements Runnable {

    @Override
    public void run() {

        int no;
        for (no = 2; no <= 10; no++) {
            int count = 0;
            for (int i = 2; i <= no / 2; i++)
                if (no % i == 0) {
                    count++;
                    break;
                }
            if (count != 0) {
                System.out.println(no + " Number is not prime");
            }

        }
    }

}


public class Question2 {

    public static void main(String[] args) {

        PrimeNum primeNum = new PrimeNum();
        Thread pThread = new Thread(primeNum);
        NonPrimeNum NonPrimeNum = new NonPrimeNum();
        Thread npThread = new Thread(NonPrimeNum);
        pThread.start();
        npThread.start();

    }
}
