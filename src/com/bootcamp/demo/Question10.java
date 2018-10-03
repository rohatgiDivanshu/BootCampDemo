package com.bootcamp.demo;

public class Question10 {

    public static void main(String[] args) {

        Question10 question10 = new Question10();
        question10.addition(3, 5);
        question10.addition(342.62, 7546.534);
        question10.multiplication(43.23f, 76.67f);
        question10.multiplication(3, 8);
        question10.concatinationOfStrings("Rohatgi", "Divanshu");
        question10.concatinationOfStrings("Boot", "Camp", "TTN");
    }

    private void addition(int number1, int number2) {

        int additonOfNumbers = number1 + number2;
        System.out.println(additonOfNumbers);

    }

    private void addition(double number1, double number2) {

        double resultOfAddition = number1 + number2;
        System.out.println(resultOfAddition);

    }

    private void multiplication(float number1, float number2) {

        float resultOfMultiplication = number1 * number2;
        System.out.println(resultOfMultiplication);
    }

    private void multiplication(int number1, int number2) {

        int resultOfIntegers = number1 * number2;
        System.out.println(resultOfIntegers);
    }

    private void concatinationOfStrings(String string1, String string2) {

        String result = string1.concat(string2);
        System.out.println(result);
    }

    private void concatinationOfStrings(String string1, String string2, String string3) {

        String result = (string1.concat(string2)).concat(string3);
        System.out.println(result);
    }

}
