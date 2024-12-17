package com.comarch.szkolenia.strumienie.strumienie;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,7,3,4,1,5,4,6,7,8,0,9,10,11);

        for (int element : list) {

        }

        list.stream()
                .peek(System.out::println)
                .filter(i -> i > 3)
                .peek(System.out::println)
                .filter(i -> i < 7)
                .peek(System.out::println)
                .limit(2)
                .forEach(System.out::println);

        Optional<Integer> o;
        Stream<Integer> s;

        IntStream is;
        DoubleStream ds;
        LongStream ls;


        OptionalDouble od;
        OptionalInt oi;
        OptionalLong ol;

        list.stream()
                .mapToInt(i -> i)
                .average();
    }
}
