package edu.pnu.collection;

public class GenericList<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList () {
        this.data = (T[]) new Object[100];
    }

    public Object[] getList(int limit) {
        this.data = new Object[limit];
        return data;
    }

}
