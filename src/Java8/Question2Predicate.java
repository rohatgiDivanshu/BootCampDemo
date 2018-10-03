package Java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Question2Predicate {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (a) -> a > 10;
        System.out.println(predicate.test(5));

        Function<Integer, Integer> function = integer -> integer;
        System.out.println(function.apply(4));
    }
}
