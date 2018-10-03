package com.exercise.second;

class AgeIsNegativeException extends Exception {
    String errorMessage;

    public AgeIsNegativeException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return errorMessage;
    }


    @Override
    public void printStackTrace() {
        super.printStackTrace();
        String s = null;
    }
}


public class Question13 extends AgeIsNegativeException {

    public Question13(String errorMessage) {
        super(errorMessage);
    }


    public static void main(String[] args) {

        Question13 question13 = new Question13("Age can not be negative");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Your Age");
//
//        int age = sc.nextInt();

/*        try {
            if (age < 0) {
                throw new AgeIsNegativeException("Age can not be negative");
            } else {
                System.out.println("Your age is " + age);
            }
        } catch (AgeIsNegativeException ex) {
            System.out.println(ex);
            ex.printStackTrace();

            System.out.println();
        }*/

        System.out.println(question13.errorMessage);
//        question13.printStackTrace();
    }

}
