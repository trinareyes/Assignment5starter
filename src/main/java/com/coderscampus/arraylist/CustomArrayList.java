package com.coderscampus.arraylist;


public class CustomArrayList<T> implements CustomList<T> {


    private Object[] items = new Object[10];
    private int size = 0;


    @Override
    public boolean add(T item) {

        return add(size, item);
    }


    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Out of bounds: " + index);
        }


        if (size == items.length) {
            Object[] newTally = new Object[size * 2];
            for (int i = 0; i < size; i++) {
                newTally[i] = items[i];
            }
            items = newTally;
        }


        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }


        items[index] = item;
        size++;
        return true;
    }


    @Override
    public int getSize() {
        return size;


    }


    @Override
    public T get(int index) {

        validateIndexBounds(index);
        return (T) items[index];


    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        validateIndexBounds(index);

        T removedItem = (T) items[index];
        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }

        items[size - 1] = null;
        size--;
        return removedItem;
    }

    private void validateIndexBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index" + index + ", Size:" + size);

        }
    }

}
	

