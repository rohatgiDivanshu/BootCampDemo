package com.bootcamp.demo;

import java.util.Scanner;

public class SwitchDemo {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numberOfDay = sc.nextInt();


        switch (numberOfDay) {

            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Monday - Thrusday");
                break;

            case 5:
            case 6:
            case 7:
                System.out.println("Friday - Sunday");
        }
    }
}
