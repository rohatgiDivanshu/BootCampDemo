package com.Java8;


interface calculate{
    int operation(int a, int b);
}

public class Demo2 {

    public static void main(String[] args) {

        calculate add = (a, b)-> a+b;
        calculate sub = (a, b)-> a-b;
        calculate multiple = (a, b)-> a*b;
        calculate divide = (a, b)-> a/b;

        System.out.println(add.operation(5,6));
        System.out.println(sub.operation(5,6));
        System.out.println(multiple.operation(5,6));
        System.out.println(divide.operation(5,6));

    }
}
