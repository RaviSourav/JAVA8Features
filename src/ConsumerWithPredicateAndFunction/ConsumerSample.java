package ConsumerWithPredicateAndFunction;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("Hi This is "+ s);
        consumer.accept("Ravi");
        consumer.accept("Sourav");
    }
}
