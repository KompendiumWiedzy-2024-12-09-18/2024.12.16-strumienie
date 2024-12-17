package com.comarch.szkolenia.strumienie.strumienie;

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie1 {
    /*
    Mamy liste integerow. Policz srednia tylko parzystych liczb.
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(45,2,52,356,56,32,63,34,52,1,7,76,32,36,2,3,2,68,765,45);

        int sum = 0;
        int evenCounter = 0;
        for(int element : list) {
            if(element % 2 == 0) {
                sum += element;
                evenCounter++;
            }
        }

        double avg = ((double) sum) / ((double) evenCounter);
        System.out.println(avg);

        /************************************/

        list.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(i -> i)
                .average()
                .ifPresent(System.out::println);
    }
}
