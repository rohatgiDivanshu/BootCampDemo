package Multithreading_Exercise;


class PrimeOrNot extends Thread {

    @Override
    public void run() {

        for (int i = 2; i <= 10; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) {
                    count++;
                    break;
                }
            if (count == 0) {
                System.out.println(i + " Number is prime");
            } else {
                System.out.println(i + " Number is not prime");
            }
        }
    }
}


public class Question2 {

    public static void main(String[] args) {

        PrimeOrNot primeOrNot = new PrimeOrNot();
        PrimeOrNot primeOrNot1 = new PrimeOrNot();
        primeOrNot.run();
        primeOrNot1.run();

    }
}
