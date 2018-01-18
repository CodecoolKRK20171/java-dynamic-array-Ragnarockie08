package com.codecool.dynamicArrayDojo;


import com.codecool.dynamicArrayDojo.queue.CustomQueue;
import com.codecool.dynamicArrayDojo.stack.Stack;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        CustomQueue<Integer> q = new CustomQueue<>();

        q.enqueue(1, 21);
        q.enqueue(2, 2);
        q.enqueue(3, 22);

        System.out.println(q);

        System.out.println(q.peek().getValue());
    }
}
