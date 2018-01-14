package com.codecool.dynamicArrayDojo;


import com.codecool.dynamicArrayDojo.linked_list.singleList.SingleLinkedList;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.add("Janusz");
        linkedList.add("Karol");
        linkedList.add("Wojtek");
        linkedList.add("Oliwia");
        linkedList.add(3, "Igor");
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(3);
        System.out.println(list);

    }
}
