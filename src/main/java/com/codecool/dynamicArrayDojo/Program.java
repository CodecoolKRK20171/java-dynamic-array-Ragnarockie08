package com.codecool.dynamicArrayDojo;


import com.codecool.dynamicArrayDojo.linked_list.doubleList.DoubleLinkedList;
import com.codecool.dynamicArrayDojo.linked_list.singleList.SingleLinkedList;
import com.codecool.dynamicArrayDojo.stack.Stack;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();

        Stack<Integer> stack = new Stack<>(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);



    }
}
