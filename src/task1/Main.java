package task1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        print();
        getName(createStream());
    }

    public static Stream<String> createStream() {
        return Stream.of("Tom", "Marry", "Alex", "Tamara", "Masha", "Timmy");
    }

    public static void getName(Stream<String> names) {
        AtomicInteger cnt = new AtomicInteger(0);
        names.filter(str -> str.startsWith("T"))
                .forEach(x -> System.out.println(cnt.incrementAndGet() + ". " + x));

    }

    public static void print() {
        System.out.println("Names are started with T : ");
    }

}
