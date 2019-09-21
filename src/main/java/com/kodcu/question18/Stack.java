package com.kodcu.question18;


import java.util.Arrays;

/*
TODO
 1 - Convert Stack.java into type safe mode - Generics
 2 - What is the lesson  ?
*/

public class Stack { // 1_1
    public Object[] elements; // 1_2  and 2_1
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;


    //1_3 and 2_2
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }


    public void push(Object e) { //1_4
        ensureCapacity();
        elements[size++] = e;
    }


    public Object pop() { //1_5
        if (size == 0) {
            throw new EmptyStackException();
        }


        Object result = elements[--size]; //1_6 and and 2_3
        elements[size] = null;
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly doubling the capacity
     * each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("hello"); // write 12 and run again

        String result = (String) stack.pop();
        System.out.println(result.toUpperCase());

    }
}