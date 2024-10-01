/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack;

/**
 *
 * @author JUNAID COMPUTER
 */
public class Stack {
    public class Node{
    int data;
    Node next;
    
    Node(int data){
    this.data=data;
    this.next=null;
    
    
    }

    }
     private Node top;
     private int size;
     public Stack(){
     top = null;
     size = 0;
     }
     
     public void push(int data){
     Node newNode = new Node(data);
      if (top == null) {
            top = newNode;
        } else {

     newNode.next=top;
     top =newNode;
      }
      size++;
     }
     public void peek(){
         System.out.println(top.data);
     }
     public int pop(){
          if (top == null) {
            throw new RuntimeException("Stack is empty");
        }

     int pop_data = top.data;
     top= top.next;
     size--;
     return pop_data;
     
     }
       public boolean isEmpty() {
        return top == null;
    }
        public int size() {
        return size;
    }
         public void printStack() {
        Node temp = top; 
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      Stack list = new Stack();
      list.push(10);
      list.push(20);
      list.push(30);
      list.pop();
      list.printStack();
      list.size();
      list.isEmpty();
      list.peek();
      System.out.println("Stack size: " + list.size());
      
    }
}
