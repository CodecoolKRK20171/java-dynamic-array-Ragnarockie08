package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

public class DynamicIntArray<E> {

    private  Object[] data;
    private int size;

    public DynamicIntArray(){
        data = new Object [0];
        size = 0;
    }

    public DynamicIntArray(int initialSize){
        data = new Object [initialSize];
        size = data.length;
    }

    private void increaseDataSize(int newSize){

        int length = data.length;
        if (length < newSize){
            data = Arrays.copyOf(data, newSize);
        }
    }

    public E get(int index){

        checkIndex(index);
        return (E) data[index];
    }

    public boolean add(E element){

        increaseDataSize(size + 1);
        data[size++] = element;
        return true;
    }

    public boolean remove(int index){
        checkIndex(index);

        for (int i = index; i < size() - 1; i++) {
            data[i] = data[i + 1];
        }

        data = Arrays.copyOf(data, --size);

        return true;

    }

    public boolean insert(int index, E element){
        checkIndex(index);
        data[index] = element;
        return true;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void checkIndex(int index){
        if (index >= size || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public String toString(){
        String output = "";
        for (Object element: data){
            output += " " + element;
        }
        return output;
    }

}
