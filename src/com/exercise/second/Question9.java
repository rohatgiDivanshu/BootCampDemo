package com.exercise.second;


interface stressTest {

    //some formulae

}


interface loadTest {

    //some formulae

}

abstract class Wooden {

    String type;
    String durability;
    double price;
    String finishing;

}

abstract class Metal {

    String Type;
    double price;
    String finishing;

}

class Chair extends Wooden implements stressTest, loadTest {

    private double height;
    private double width;
    private String color;
    private String chairType;
    private double makingCost;

}


class Table extends Wooden implements stressTest, loadTest {

    private double height;
    private double width;
    private String color;
    private String tableType;
    private double cost;

}


class ChairMetallic extends Metal {

    private double height;
    private double width;
    private String color;
    private String chairType;
    private double cost;


}


class TableMetallic extends Metal {

    private double height;
    private double width;
    private String color;
    private String chairType;
    private double cost;

}


public class Question9 {

    public static void main(String[] args) {

    }
}
