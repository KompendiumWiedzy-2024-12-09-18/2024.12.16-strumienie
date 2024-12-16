package com.comarch.szkolenia.strumienie.anonimowe;

import com.comarch.szkolenia.strumienie.optional.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Wiesiek");
        names.add("Adam");
        names.add("Zbyszek");
        names.add("Mateusz");
        names.add("Karol");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        List<Client> clients = new ArrayList<>();
        clients.add(new Client(2, "Janusz", "Kowalski"));
        clients.add(new Client(1, "Wiesiek", "Malinowski"));
        clients.add(new Client(4, "Mateusz", "Bereda"));
        clients.add(new Client(3, "Karol", "Jakis"));

        System.out.println(clients);

        Collections.sort(clients, new PorownywaczKlientowPoImieniuRosnaco());

        System.out.println(clients);

        Collections.sort(clients, new PorownywaczKlietnowPoNazwiskuMalejaco());

        System.out.println(clients);
    }
}
