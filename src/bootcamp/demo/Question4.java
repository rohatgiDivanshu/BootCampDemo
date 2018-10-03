package bootcamp.demo;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        int uppercount = 0;
        int lowercount = 0;
        int digitcount = 0;
        int specialcharacter = 0;

        System.out.println("Please enter a string");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int length = string.length();

        for (int i = 0; i < length; i++) {

            char[] array = string.toCharArray();

            char ch = array[i];

            if ((Character.isUpperCase(ch))) {

                uppercount++;


            } else if (Character.isLowerCase(ch)) {

                lowercount++;

            } else if (Character.isDigit(ch)) {

                digitcount++;

            } else

                specialcharacter++;

        }

        System.out.println("Number of Lowercase Characters and its percentage: " + lowercount + " :" + (double) (lowercount * 100) / length + "%");
        System.out.println("Number of Digits Characters and its percentage: " + digitcount + " :" + (double) (digitcount * 100) / length + "%");
        System.out.println("Number of special Characters and its percentage: " + specialcharacter + " :" + (double) (specialcharacter * 100) / length + "%");
        System.out.println("Number of Uppercase Characters and its percentage: " + uppercount + " :" + (double) (uppercount * 100) / length + "%");


    }

}


