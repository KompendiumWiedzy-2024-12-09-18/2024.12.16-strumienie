package com.comarch.szkolenia.strumienie.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<Client> clientBox = findClientById(2);
        if(clientBox.isPresent()) {
            System.out.println(clientBox.get().getName());
        }

        Client c = clientBox.orElse(new Client(0, "default", "deafult"));
        System.out.println(c.getName());
    }

    /* author: Mateusz */
    public static Optional<Client> findClientById(int id) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client(1, "Janusz", "Kowalski"));
        clients.add(new Client(2, "Wiesiek", "Malinowski"));
        clients.add(new Client(3, "Mateusz", "Bereda"));

        for(Client client : clients) {
            if(client.getId() == id) {
                return Optional.of(client);
            }
        }

        return Optional.empty();
    }
}
