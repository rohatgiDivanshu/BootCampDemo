package com.bootcamp.demo;

public class Question5 {


    public static void main(String[] args) {

        int arr1[] = new int[]{3, 5, 7, 2, 3};
        int arr2[] = new int[]{1, 6, 3, 2, 7};

        for (int i = 0; i <= arr1.length - 1; i++) {
            for (int j = i; j <= arr2.length - 1; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println("Same I " + i);
                    System.out.println("Same J " + j);
                    System.out.println("Same Arr " + arr1[i]);
                }
            }
        }

    }
}
