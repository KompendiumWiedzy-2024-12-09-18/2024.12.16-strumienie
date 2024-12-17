package com.comarch.szkolenia.strumienie.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Optional<Client> clientBox = findClientById(10);
        if(clientBox.isPresent()) {
            System.out.println(clientBox.get().getName());
        }

        Client c = clientBox.orElse(new Client(0, "default", "deafult"));
        System.out.println(c.getName());

        Supplier<Client> defaultClietSupplier = () -> new Client(0, "d", "d");

        clientBox.orElseGet(defaultClietSupplier);

        clientBox.ifPresent(System.out::println);
        clientBox.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("pudelko jest puste "));

        /*try {
            clientBox.get();
        } catch (NoSuchElementException e) {
            throw new ClientNotFoundException();
        }*/

        clientBox.orElseThrow(ClientNotFoundException::new);
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
