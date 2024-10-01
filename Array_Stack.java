/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

/**
 *
 * @author JUNAID COMPUTER
 */
public class Array_Stack {
      private int[] array;
    private int top;
    private int maxSize;

    // Constructor
    public Array_Stack(int size) {
        array = new int[size];
        top = -1;
        maxSize = size;
    }

    // Push element onto stack
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = data;
    }

    // Pop element from stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top--];
    }

    // Get top element without removing
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Get stack size
    public int size() {
        return top + 1;
    }

    // Print stack elements
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array_Stack stack = new Array_Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // Output: 10 20 30
        stack.peek(); // Output: 30
        System.out.println("Stack size: " + stack.size()); // Output: 3
        stack.pop();
        stack.printStack(); // Output: 10 20
    }
}








