package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 34, 6, 23, 7, 3);
        Collections.sort(integerList, (o1, o2) -> o1 - o2);

        System.out.println(integerList);

        List<String> stringList = Arrays.asList("Divanshu", "Manisha", "Akash", "Gurleen");
        Collections.sort(stringList, (o1, o2) -> o1.compareTo(o2));

        System.out.println(stringList);
    }
}
