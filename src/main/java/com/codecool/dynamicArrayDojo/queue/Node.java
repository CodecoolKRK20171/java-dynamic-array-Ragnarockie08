package com.codecool.dynamicArrayDojo.queue;

public class Node<T> {
    private T value;
    private Node nextNode;

    public Node(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }
}