package DesignPattern;


class Dummy {

    private static Dummy dummy = null;

    public String s;

    private Dummy() {
        s = "This is Dummy singleton class";
    }

    public static Dummy getInstance() {
        if (dummy == null) {
            dummy = new Dummy();
        }
        return dummy;
    }
}

public class Question1 {

    public static void main(String[] args) {

        Dummy x = Dummy.getInstance();
        System.out.println(x.s);

    }
}
