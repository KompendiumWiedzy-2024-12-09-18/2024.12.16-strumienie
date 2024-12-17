package com.comarch.szkolenia.strumienie.anonimowe;

import com.comarch.szkolenia.strumienie.optional.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        /*Collections.sort(clients, new Comparator<>() {
            @Override
            public int compare(Client o1, Client o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        Collections.sort(clients, (c1, c2) -> c1.getName().compareTo(c2.getName()));

        System.out.println(clients);

        /*Collections.sort(clients, new Comparator<>() {
            @Override
            public int compare(Client o1, Client o2) {
                return -o1.getSurname().compareTo(o2.getSurname());
            }
        });*/

        Collections.sort(clients, (c1, c2) -> -c1.getSurname().compareTo(c2.getSurname()));

        System.out.println(clients);

        MojInterfejs mojInterfejs = new MojInterfejs() {
            @Override
            public void x() {
                System.out.println("X");
            }

            @Override
            public void y() {
                System.out.println("Y");
            }

            @Override
            public void z() {
                System.out.println("Z");
            }
        };

        mojInterfejs.x();
        mojInterfejs.y();
        mojInterfejs.z();
    }
}
