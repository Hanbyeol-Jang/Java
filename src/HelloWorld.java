import java.util.function.Function;

public class HelloWorld {
    public static void main(String[] args) {
        Function<Integer, Integer> adder = (Integer x) -> {
            return x + 10;
        };

        int result = adder.apply(5);

        System.out.println(result);
    }
}
