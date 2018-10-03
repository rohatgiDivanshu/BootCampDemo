package Java8;

@FunctionalInterface
interface calculation<T> {
    void perform(T o);
}

public class GenricDemo {

    public static void main(String[] args) {

        calculation<String> stringcalculation = (o) -> System.out.println(o);

        stringcalculation.perform("Hello");
    }

}
