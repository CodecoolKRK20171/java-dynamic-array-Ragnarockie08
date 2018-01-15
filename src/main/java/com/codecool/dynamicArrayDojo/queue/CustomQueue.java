package com.codecool.dynamicArrayDojo.queue;

import java.util.NoSuchElementException;

public class CustomQueue<T> {

    private Node<T> peekItem;
    private Node<T> last;
    private int size;

    public CustomQueue() {
        this.peekItem = null;
        this.size = 0;
    }

    public void enqueue(T value){

        Node node = new Node(value);

        if (peekItem == null){
            peekItem = node;
            last = node;
        }else {
            last.setNextNode(node);
            last = node;
        }
        size++;
    }

    public void enqueue(T value, int priority){

        Node node = new Node(value);
        node.setPriority(priority);

        if (peekItem == null){
            enqueue(value);
        } else if (priority == 0) {
            enqueue(value);
        }else {
            handlePriorityQueue(node);
        }
    }

    public void dequeue(){

        handleEmptyQueue();

        if (peekItem.getNextNode() == null){
            peekItem = null;
            last = null;
        } else {
            peekItem = peekItem.getNextNode();
        }
        size--;
    }

    public Node<T> peek(){

        handleEmptyQueue();

        if (peekItem != null){
            return peekItem;
        } else {
            throw new NoSuchElementException();
        }
    }

    public int queueSize(){
        return size;
    }

    public boolean isEmpty(){
        return peekItem == null;
    }

    public void handleEmptyQueue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
    }

    private void handlePriorityQueue(Node node){

        Node temp = peekItem;
        Node elem = temp;
        for (int i = 0; i < size; i++) {
            if (node.getPriority() > temp.getPriority()) {
                if(node.getPriority() > peekItem.getPriority()) {
                    node.setNextNode(peekItem);
                    peekItem = node;
                } else {
                    node.setNextNode(temp);
                    elem.setNextNode(node);
                }
                break;
            }
            elem = temp;
            temp = temp.getNextNode();
        }
        size++;
    }

    public String toString(){

        String output = "";
        Node element;

        if (size == 0){
            output = "[]";
        } else if (peekItem.getNextNode() == null){
            output = String.valueOf(peekItem.getValue());
        } else {
            element = peekItem;

            while(element.getNextNode() != null){
                output += " " + element.getValue();
                element = element.getNextNode();
            }
            output += " " + element.getValue();
        }
        return output;
    }

}
