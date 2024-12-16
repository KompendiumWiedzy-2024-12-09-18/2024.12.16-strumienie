package com.comarch.szkolenia.strumienie.anonimowe;

import com.comarch.szkolenia.strumienie.optional.Client;

import java.util.Comparator;

public class PorownywaczKlientowPoImieniuRosnaco implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
