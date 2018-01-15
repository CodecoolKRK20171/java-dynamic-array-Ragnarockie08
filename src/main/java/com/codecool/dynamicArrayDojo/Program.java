package com.codecool.dynamicArrayDojo;


import com.codecool.dynamicArrayDojo.linked_list.doubleList.DoubleLinkedList;
import com.codecool.dynamicArrayDojo.linked_list.singleList.SingleLinkedList;
import com.codecool.dynamicArrayDojo.queue.CustomQueue;
import com.codecool.dynamicArrayDojo.stack.Stack;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();

        CustomQueue<Integer> q = new CustomQueue<>();

        q.enqueue(1, 0);
        q.enqueue(2, 1);
        q.enqueue(3,0);
        q.enqueue(4, 4);
        System.out.println(q.peek().getValue());



        System.out.println(q.toString());





    }
}
