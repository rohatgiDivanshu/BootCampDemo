package com.Java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

    private static void refer(Integer i){
        System.out.println(i);
    }

    public static void main(String[] args) {
/*
        List<Integer> integerList = Arrays.asList(3,6,2,6);
        integerList.forEach(MethodReferenceDemo::refer);

        //System.out.println(MethodReferenceDemo::refer);

        Stream<String> builder = Stream.<String>builder().add("1").add("2").build();
        builder.forEach(System.out::println);*/


        //IntStream.range(1,15).forEach(System.out::println);

        List<List<String>> listList =  new ArrayList<>();
        listList.add(Arrays.asList("a"));
        listList.add(Arrays.asList("b"));
        System.out.println(listList);

        List<String> flatList =listList.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);

    }

}
