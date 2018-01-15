package com.codecool.dynamicArrayDojo;


import com.codecool.dynamicArrayDojo.dynamic_array.DynamicIntArray;
import com.codecool.dynamicArrayDojo.linked_list.doubleList.DoubleLinkedList;
import com.codecool.dynamicArrayDojo.linked_list.singleList.SingleLinkedList;
import com.codecool.dynamicArrayDojo.queue.CustomQueue;
import com.codecool.dynamicArrayDojo.stack.Stack;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {


        DynamicIntArray<Integer> list = new DynamicIntArray<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.insert(1,1);
        System.out.println(list);





    }
}
