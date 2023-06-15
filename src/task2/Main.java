package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        print();
        getCheapProduct(createMap());

    }

    public static Map<String, Double> createMap() {
        Map<String, Double> purchases = new HashMap<>(); //от 1.05 до 3.15.
        purchases.put("Orange", 1.1);
        purchases.put("Plum", 3.00);
        purchases.put("Watermelon", 3.15);
        purchases.put("Apple", 2.00);
        purchases.put("Cherry", 2.10);
        purchases.put("Cucumber", 1.99);
        return purchases;
    }

    public static void getCheapProduct(Map<String, Double> map) {
        AtomicInteger cnt = new AtomicInteger(0);
        map.entrySet()
                .stream()
                .filter(p -> p.getValue() <= 2)
                .map(Map.Entry::getKey)
                .forEach((key) -> System.out.println(cnt.incrementAndGet() + ". " + key));
    }

    public static void print() {
        System.out.println("Purchases are less and equal to 2.00 : ");
    }
}
