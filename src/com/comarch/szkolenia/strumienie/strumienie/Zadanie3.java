package com.comarch.szkolenia.strumienie.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    /*
    Mamy liste intow
    szukamy tylko liczb wiekszych od 3 i mniejszych od 10
    nie interesuja nas duplikaty
    chcemy wypisac na ekranie czwarta libczbe
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(4,2,65,4,56,8,5,56,98,5,9,8,5,98,8,65,8,54,65,9,56,87,56,6);

        List<Integer> result = new ArrayList<>();
        for(int liczba : list) {
            if(liczba > 3 && liczba < 10 && !result.contains(liczba)) {
                result.add(liczba);
            }
        }
        System.out.println(result.get(3));

        list.stream()
                .filter(i -> i > 3 && i < 10)
                .distinct()
                .skip(3)
                .findFirst()
                .ifPresent(System.out::println);

        String s = "asd asd";
        s.contains(" ");
        s.toLowerCase().equals(s);
        s.replace(".,", "");
        s.replaceAll("[\\.,]", "");
    }
}
