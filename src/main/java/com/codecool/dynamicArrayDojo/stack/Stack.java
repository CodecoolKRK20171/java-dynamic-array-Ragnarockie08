package com.codecool.dynamicArrayDojo.stack;

import java.io.IOException;

public class Stack<T> {

    private Object data[];
    private int space;
    private int peekItem = -1;

    public Stack(int size) {
        this.space = size;
        this.data = new Object [size];
    }

    public void push(T value){

        checkSpace();

        data[++peekItem] = value;
        space--;
    }

    public int size(){
        return data.length;
    }

    public void pop(){
        data[peekItem--] = null;
    }

    public T peek(){
        return (T) data[peekItem];
    }

    public void checkSpace(){
        if (space < 1) {
            throw new IllegalArgumentException("No space left");
        }
    }

    public String toString(){
        String output = "";
        for (int i = size()-1; i >=0; i--){
            if (data[i] != null){
                output += " " + data[i];
            }
        }
        return output;
    }

    public int spaceLeft(){
        return space;
    }
}
