package Multithreading_Exercise;

class FirstThread extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("From Thread FirstThread : " + i);
        }
    }
}

class SecondThread extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("From Thread SecondThread : " + i);
        }
    }
}

class ThirdThread extends Thread {
    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("From Thread ThirdThread : " + i);
        }
    }
}


public class Question3 {

    public static void main(String[] args) {

        new FirstThread().start();
        new SecondThread().start();
        new ThirdThread().start();

    }
}

