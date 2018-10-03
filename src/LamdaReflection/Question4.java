package LamdaReflection;

interface table {

    int perform(int a);
}

public class Question4 {

    public static void main(String[] args) {

        table number = (a) -> a;
        System.out.println(number.perform(3));
    }
}
