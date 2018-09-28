package com.CollectionExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {

    public static void main(String[] args) {

        float sum = 0.0f;

        List<Float> numberList = new ArrayList<>();
        numberList.add(4f);
        numberList.add(23f);
        numberList.add(74f);
        numberList.add(43f);
        numberList.add(1f);
        numberList.add(3f);
        numberList.add(7f);


        Iterator<Float> iterator = numberList.iterator();

        while (iterator.hasNext()) {

            float n = iterator.next();
            sum += n;
        }

//        for(Float nl : numberList){
//
//            sum += nl;
//        }

        System.out.println("Sum of Numbers :" + sum);

    }
}
