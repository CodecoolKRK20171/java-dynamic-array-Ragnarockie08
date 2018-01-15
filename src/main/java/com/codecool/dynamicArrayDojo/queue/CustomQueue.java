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

    public void enqueue(T value, int priority){

        Node node = new Node(value);
        node.setPriority(priority);

        if (peekItem == null){
            peekItem = node;
            last = node;
        } else if (priority == 0) {
            last.setNextNode(node);
            last = node;
            last.setNextNode(null);
        }else {
            Node temp = peekItem;
            for (int i = 0; i < size - 1; i++) {
                if (node.getPriority() > temp.getPriority()) {
                    temp.getNextNode().setNextNode(node);
                    node.setNextNode(temp);
                    if (i == 0){
                        peekItem = node;
                    }
                }
                temp = temp.getNextNode();
            }
        }
        size++;
    }

    public void dequeue(){

        handleEmptyQueue();

        if (peekItem != null){
            if (peekItem.getNextNode() == null){
                peekItem = null;
                last = null;
            } else {
                peekItem = peekItem.getNextNode();
            }
            size--;
        }
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

}
