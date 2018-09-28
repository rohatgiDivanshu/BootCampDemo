package com.Java8;


import java.util.function.BiFunction;

public class PredicateDemo {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (i1, i2) -> i1+i2;
        System.out.println(biFunction.apply(2,564));

        Runnable runnable = () -> System.out.println("Hello from Runnable");
        runnable.run();
    }


}
