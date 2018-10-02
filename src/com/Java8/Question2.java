package com.Java8;

import java.util.function.Consumer;

public class Question2 {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (arg) -> {

            System.out.println(arg + "OK");

        };

        consumer1.accept("Consumer Accept - ");

    }
}
