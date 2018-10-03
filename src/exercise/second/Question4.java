package exercise.second;

public class Question4 {


    private static Question4 myObj;

    static {
        myObj = new Question4();
    }

    private Question4() {

    }

    public static Question4 getInstance() {
        return myObj;
    }

    public static void main(String a[]) {
        Question4 ms = getInstance();
        ms.singletonTest();
    }

    public void singletonTest() {
        System.out.println("Working.. From singleton Class");
    }

}
