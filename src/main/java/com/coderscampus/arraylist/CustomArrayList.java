package com.coderscampus.arraylist;


public class CustomArrayList<T> implements CustomList<T> {


    private Object[] items = new Object[10];
    private int size = 0;


    @Override
    public boolean add(T item) {

        if (size == items.length) {

            Object[] newTally = new Object[items.length * 2];

            for (int i = 0; i < items.length; i++) {
                newTally[i] = items[i];
            }
            items = newTally;
        }

        items[size] = item;
        size++;
        return true;
    }


    @Override
    public int getSize() {
        return size;


    }


    @Override
    public T get(int index) {

        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index" + index + ", Size:" + size);

        }
        return (T) items[index];

    }


}
	

