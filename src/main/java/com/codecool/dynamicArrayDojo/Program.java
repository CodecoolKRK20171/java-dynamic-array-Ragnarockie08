package com.codecool.dynamicArrayDojo;


import com.codecool.dynamicArrayDojo.dynamic_array.DynamicIntArray;
import com.codecool.dynamicArrayDojo.queue.CustomQueue;
import com.codecool.dynamicArrayDojo.stack.Stack;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        DynamicIntArray<Integer> array = new DynamicIntArray();

        array.add(1);
        array.add(2);
        array.add(3);
        array.insert(5, 4);
        System.out.println(array);

    }
}
