package com.comarch.szkolenia.strumienie.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Przyklad {
    public static void main(String[] args) {

        loadAndCalculate(Przyklad::loadDataFromDb, Przyklad::calculate1);
        loadAndCalculate(Przyklad::loadDataFromServer, Przyklad::calculate2);
        loadAndCalculate(Przyklad::loadDataFromFile, Przyklad::calculate3);
    }

    public static int loadDataFromDb() {
        return 5;
    }

    public static int loadDataFromFile() {
        return 10;
    }

    public static int loadDataFromServer() {
        return 15;
    }

    public static int calculate1(int x) {
        return x * 15;
    }

    public static int calculate2(int x) {
        return x * 5;
    }

    public static int calculate3(int x) {
        return x * 34;
    }

    public static void loadAndCalculate(Supplier<Integer> loader, UnaryOperator<Integer> calculator) {
        int x = loader.get();
        int y = calculator.apply(x);
        System.out.println(y);
    }
}
