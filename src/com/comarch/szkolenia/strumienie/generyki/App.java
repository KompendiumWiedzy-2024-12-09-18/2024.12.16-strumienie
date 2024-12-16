package com.comarch.szkolenia.strumienie.generyki;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        IntPair intPair = new IntPair(4,7);
        List<IntPair> intPairs = new ArrayList<>();
        intPairs.add(new IntPair(3,7));
        intPairs.add(new IntPair(10,15));
        intPairs.add(new IntPair(20,55));

        DoublePair doublePair = new DoublePair(4.4, 10.6);
        IntDoublePair intDoublePair = new IntDoublePair(5, 7.7);

        Pair<Integer, Integer> ints = new Pair<>(4,4);
        Pair<String, Double> stringDoublePair = new Pair<>("cos", 5.5);
        Pair<Boolean, Character> booleanCharacterPair = new Pair<>(true, 'g');
    }
}
