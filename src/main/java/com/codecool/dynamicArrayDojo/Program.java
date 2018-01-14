package com.codecool.dynamicArrayDojo;


import com.codecool.dynamicArrayDojo.linked_list.doubleList.DoubleLinkedList;
import com.codecool.dynamicArrayDojo.linked_list.singleList.SingleLinkedList;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1, 0);
        System.out.println(linkedList);
//        linkedList.remove(0);
//        System.out.println(linkedList);

    }
}
