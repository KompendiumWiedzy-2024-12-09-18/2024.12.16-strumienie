package com.comarch.szkolenia.strumienie.strumienie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadanie2 {
    /*
    Mamy liste imion.
    Usun wszystkie imiona zaczynajace sie na "A" i wypisz
     wszystkie pozostale imiona w kolejnosci alfabetycznej tylko pisane malymi literami
     */
    public static void main(String[] args) {
        List<String> names = List.of(
                "Ania",
                "Wiesiek",
                "Adam",
                "Karol",
                "Zbyszek",
                "Alfred",
                "Mateusz"
        );

        List<String> result = new ArrayList<>();
        for(String name : names) {
            if(!name.startsWith("A")) {
                result.add(name.toLowerCase());
            }
        }
        Collections.sort(result);
        System.out.println(result);

        /**************************************/

        names.stream()
                .filter(name -> !name.startsWith("A"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }
}
