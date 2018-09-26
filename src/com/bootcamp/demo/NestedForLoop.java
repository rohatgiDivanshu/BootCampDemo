package com.bootcamp.demo;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {

                System.out.println("Print of I:" + i);
                System.out.println("Print of J:" + j);
                System.out.println("Question4 :" + i + j);
            }
        }

    }
}
