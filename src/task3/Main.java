package task3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        print();
        getColdDay(createMap());
    }

    public static Map<String, Integer> createMap() {
        Map<String, Integer> week = new LinkedHashMap<>(); //от +8 до +15 градусов, включительно.
        week.put("Monday", 8);
        week.put("Tuesday", 10);
        week.put("Wednesday", 15);
        week.put("Thursday", 14);
        week.put("Friday", 13);
        week.put("Sunday", 11);
        week.put("Saturday", 9);
        return week;
    }

    public static void getColdDay(Map<String, Integer> map) { //от +10 до +13 градусов, включительно.
        AtomicInteger cnt = new AtomicInteger(0);
        map.entrySet()
                .stream()
                .filter(p -> p.getValue() >= 10 && p.getValue() <= 13)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) -> System.out.println(cnt.incrementAndGet() + ". " + key + "(+" + value + ")"));
    }

    public static void print() {
        System.out.println("Temperature was from +10 to +13 degrees in those days: ");
    }

}
