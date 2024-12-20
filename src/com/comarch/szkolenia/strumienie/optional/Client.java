package com.comarch.szkolenia.strumienie.optional;

public class Client /*implements Comparable<Client>*/ {
    private int id;
    private String name;
    private String surname;

    public Client(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    /*@Override
    public int compareTo(Client o) {
        int nameCompare = this.name.compareTo(o.name);
        if(nameCompare == 0) {
            return this.surname.compareTo(o.surname);
        }
        return nameCompare;
    }*/
}
