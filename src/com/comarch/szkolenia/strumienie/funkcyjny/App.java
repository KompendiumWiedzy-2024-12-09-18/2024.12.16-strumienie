package com.comarch.szkolenia.strumienie.funkcyjny;

import com.comarch.szkolenia.strumienie.optional.Client;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> "Liczba: " + i;

        System.out.println(function.apply(5));
        System.out.println(function.apply(10));
        System.out.println(function.apply(20));

        UnaryOperator<Integer> unaryOperator = i -> i * 10;

        System.out.println(unaryOperator.apply(3));
        System.out.println(unaryOperator.apply(7));
        System.out.println(unaryOperator.apply(17));

        BiFunction<String, Integer, Double> biFunction = (s, i) -> ((double) s.length()) / ((double) i);

        System.out.println(biFunction.apply("janusz", 7));
        System.out.println(biFunction.apply("mateusz", 4));
        System.out.println(biFunction.apply("zbyszek", 12));

        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println(predicate.test("mateusz"));
        System.out.println(predicate.test("jan"));

        Supplier<Client> supplier = () -> new Client(1, "janusz", "kowalski");

        System.out.println(supplier.get());

        Consumer<Client> consumer = System.out::println;

        consumer.accept(new Client(2, "wiesiek", "malinowski"));
        consumer.accept(supplier.get());

        InterfejsFunkcyjny funkcja = () -> System.out.println("zadzialalo !!");
        funkcja.metoda();

        Function<Integer, String> function2 = i -> {
            if (i < 0) {
                return "malo";
            } else if (i < 10) {
                return "troche";
            } else {
                return "duzo";
            }
        };

        System.out.println(function2.apply(5));
        System.out.println(function2.apply(-5));
        System.out.println(function2.apply(44));

        TriFunction<String, String, Integer, Double> triFunction = (s1, s2, i) -> (s1.length() * s2.length()) / (double) i;

        System.out.println(triFunction.apply("jan", "janusz", 10));
    }
}
