package com.comarch.szkolenia.strumienie.generyki;

public class Pair <T, W> {
    private T x;
    private W y;

    public Pair(T x, W y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public W getY() {
        return y;
    }
}
