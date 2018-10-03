package Java8;

interface calci<T, R> {
    R opertion(T a, R r);
}

public class GenricDemo2 {

    public static void main(String[] args) {

        calci<Integer, Integer> add = (a, integer) -> a + integer;
        System.out.println(add.opertion(43, 32));
    }
}
