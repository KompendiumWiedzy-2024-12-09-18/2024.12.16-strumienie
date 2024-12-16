package com.comarch.szkolenia.strumienie.generyki;

public class NaszaArrayLista <T> {
    Object[] objects = new Object[10];

    public T get(int i) {
        return (T) this.objects[i];
    }

    public void add(T element) {
        objects[2] = element;
    }
}
