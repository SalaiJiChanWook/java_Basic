/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kopylibs;

/**
 *
 * @author DELL-PC
 */
public class Kopy {
    String stack[];
    int size,top;
    
    public Kopy(int size)
    {
        this.size = size;
        stack = new String[size];
        top = -1;
    }

    public String[] getStack() {
        return stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
    
    
    
     public void push(String data){
        top++;
        stack[top] = data;
    }
    
    public void pop(){
        --top;
    }
    public void peek(){
        System.out.println("The top element is: "+ stack[top]);
    }
    public void isFull(){
        if (top==size-1){
            System.out.println("The stack is full.");
        }
        else
        {
            System.out.println("The Stack is not full.");
        }
    }
    public void isEmpty(){
        if (top == -1)
        {
            System.out.println("The stack is empty.");
        }
        else
        {
            System.out.println("The stack is not empty.");
        }
    }
}
