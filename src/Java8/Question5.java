package Java8;

import java.util.Arrays;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6);
        System.out.println("list is " + numbers);
        System.out.println(numbers
                .stream().mapToDouble(a -> a).average());
    }
}
