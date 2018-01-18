package com.codecool.dynamicArrayDojo;


import com.codecool.dynamicArrayDojo.linked_list.doubleList.DoubleLinkedList;
import com.codecool.dynamicArrayDojo.linked_list.singleList.SingleLinkedList;
import com.codecool.dynamicArrayDojo.queue.CustomQueue;
import com.codecool.dynamicArrayDojo.stack.Stack;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

      SingleLinkedList<Integer> list = new SingleLinkedList();

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      System.out.println(list);

    }
}
