package com.codecool.dynamicArrayDojo.dynamic_array;

import java.util.Arrays;

public class DynamicIntArray<E> {

    private int capacity = 10;
    private  Object[] data;
    private int size;

    public DynamicIntArray(){

        data = new Object [capacity];
        size = 0;
    }

    public DynamicIntArray(int initialSize){
        data = new Object [initialSize];
        this.capacity = initialSize;
        size = 0;
    }

    private void increaseDataSize(){

        if (size == capacity){
            data = Arrays.copyOf(data, capacity * 2);
        }
    }

    public E get(int index){

        checkIndex(index);
        return (E) data[index];
    }

    public boolean add(E element){

        increaseDataSize();
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

    public void insert(int index, E element){


        if (index >= size){
            add(element);
        } else if (index > 0) {
            data = Arrays.copyOf(data, ++size);
            for (int i = size()-2; i >= index; i--) {
                data[i+1] = data[i];
            }
            data[index] = element;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void checkIndex(int index){
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public String toString(){
        String output = "";
        for (Object element: data){
            if (element == null){
                continue;
            }
            output += " " + element;
        }
        return output;
    }

}
