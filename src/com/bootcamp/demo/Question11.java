package com.bootcamp.demo;


abstract class Bank {

    abstract double prinicpalValue();

    abstract float rateValue();

    abstract int timeValue();

    abstract String getDetails();

    abstract double simpleInterstCalculation();

    abstract double compundInterstCalculation();


}

class SBI extends Bank {

    @Override
    double prinicpalValue() {

//        Scanner scPrinciple = new Scanner(System.in);
//        System.out.println("Enter Principle Amount for SBI Bank :");
//        double principle = scPrinciple.nextDouble();
        double principle = 12200;
        return principle;
    }

    @Override
    float rateValue() {

//        Scanner scRate = new Scanner(System.in);
//        System.out.println("Enter Rate for SBI Bank :");
//        float rate = scRate.nextFloat();
        float rate = 3.02f;
        return rate;
    }

    @Override
    int timeValue() {

//        Scanner scPrinciple = new Scanner(System.in);
//        System.out.println("Enter Principle Amount for SBI Bank :");
//        double principle = scPrinciple.nextDouble();

        int time = 3;
        return time;
    }

    @Override
    String getDetails() {

        String sbiDetails = "Principle Amount :" + prinicpalValue() + "-" + "Rate Given :" + rateValue() + "-" + "Time in years:" + timeValue();
        return sbiDetails;
    }

    @Override
    double simpleInterstCalculation() {

        double simpleInterest = (prinicpalValue() * rateValue() * timeValue()) / 100;

        return simpleInterest;
    }

    @Override
    double compundInterstCalculation() {

        double compundInterest = prinicpalValue() * (Math.pow((1 + rateValue() / 100), timeValue()));

        return compundInterest;
    }
}

class BOI extends Bank {

    @Override
    double prinicpalValue() {

        double principle = 16000;
        return principle;
    }

    @Override
    float rateValue() {

        float rate = 10.02f;
        return rate;
    }

    @Override
    int timeValue() {

        int time = 9;
        return time;
    }

    @Override
    String getDetails() {

        String sbiDetails = "Principle Amount :" + prinicpalValue() + "-" + "Rate Given :" + rateValue() + "-" + "Time in years:" + timeValue();
        return sbiDetails;
    }

    @Override
    double simpleInterstCalculation() {

        double simpleInterest = (prinicpalValue() * rateValue() * timeValue()) / 100;

        return simpleInterest;
    }

    @Override
    double compundInterstCalculation() {

        double compundInterest = prinicpalValue() * (Math.pow((1 + rateValue() / 100), timeValue()));

        return compundInterest;
    }
}

class ICICI extends Bank {

    @Override
    double prinicpalValue() {

        double principle = 1000;
        return principle;
    }

    @Override
    float rateValue() {

        float rate = 6.02f;
        return rate;
    }

    @Override
    int timeValue() {

        int time = 6;
        return time;
    }

    @Override
    String getDetails() {

        String sbiDetails = "Principle Amount :" + prinicpalValue() + "-" + "Rate Given :" + rateValue() + "-" + "Time in years:" + timeValue();
        return sbiDetails;
    }

    @Override
    double simpleInterstCalculation() {

        double simpleInterest = (prinicpalValue() * rateValue() * timeValue()) / 100;

        return simpleInterest;
    }

    @Override
    double compundInterstCalculation() {

        double compundInterest = prinicpalValue() * (Math.pow((1 + rateValue() / 100), timeValue()));

        return compundInterest;
    }
}


public class Question11 {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        System.out.println("-----SBI Bank Details-----");
        System.out.println(sbi.getDetails());
        System.out.println(sbi.simpleInterstCalculation());
        System.out.println(sbi.compundInterstCalculation());

        System.out.println("-------------------------------");


        BOI boi = new BOI();
        System.out.println("-----BOI Bank Details-----");
        System.out.println(boi.getDetails());
        System.out.println(boi.simpleInterstCalculation());
        System.out.println(boi.compundInterstCalculation());

        System.out.println("-------------------------------");


        ICICI icici = new ICICI();
        System.out.println("-----ICICI Bank Details-----");
        System.out.println(icici.getDetails());
        System.out.println(icici.simpleInterstCalculation());
        System.out.println(icici.compundInterstCalculation());

        System.out.println("-------------------------------");

    }

}
