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

        try{
            checkSpace();
        } catch (IOException e){
            e.printStackTrace();
        }
        peekItem++;
        data[peekItem] = value;
        space--;
    }

    public int size(){
        return data.length;
    }

    public void pop(){
        data[peekItem] = null;
        peekItem--;
    }

    public T peek(){
        return (T) data[peekItem];
    }

    public void checkSpace() throws IOException{
        if (space < 1) {
            throw new IOException("No space left");
        }
    }

    public String toString(){
        String output = "";
        for (Object element: data){
            if (element != null){
                output += " " + element;
            }
        }
        return output;
    }

    public int spaceLeft(){
        return space;
    }
}
