package com.comarch.szkolenia.strumienie.anonimowe;

import com.comarch.szkolenia.strumienie.optional.Client;

import java.util.Comparator;

public class PorownywaczKlietnowPoNazwiskuMalejaco implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return -o1.getSurname().compareTo(o2.getSurname());
    }
}
