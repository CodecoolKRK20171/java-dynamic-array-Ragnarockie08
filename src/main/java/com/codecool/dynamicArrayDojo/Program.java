package com.codecool.dynamicArrayDojo;


public class Program {

    public static void main(String[] args) {
        System.out.println("Do not run me, run the TESTS!");

        DynamicIntArray<Integer> array = new DynamicIntArray<>();

        array.add(5);
        array.add(6);
        array.add(7);
        System.out.println(array.toString());
        array.remove(1);
        System.out.println(array.toString());
        System.out.println(array.size());

    }
}
