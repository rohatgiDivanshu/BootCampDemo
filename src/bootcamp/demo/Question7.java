package bootcamp.demo;

public class Question7 {


    static String firstName;
    static String lastName;
    static int age;

    static {
        System.out.println("From Static Block");
        firstName = "Divanshu";
        lastName = "Rohatgi";
        age = 24;
        System.out.println("------");
    }


    static void staticMethod() {

        System.out.println("From Static Method");
        System.out.println("First Name :" + firstName);
        System.out.println("Last Name :" + lastName);
        System.out.println("Age " + age);

    }

    public static void main(String[] args) {


        Question7.age = 25;
        Question7.staticMethod();

    }
}
