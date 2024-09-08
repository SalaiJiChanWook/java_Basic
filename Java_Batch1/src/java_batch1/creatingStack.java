/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_batch1;

/**
 *
 * @author DELL-PC
 */
public class creatingStack {

    String stack[];
    int size, top, i;

    public creatingStack(int size) {
        this.size = size;
        stack = new String[size];
        top = -1;
    }

    public void push(String data) {
        top++;
        stack[top] = data;
    }

    public void pop() {
        --top;
    }

    public void peek() {
        System.out.println("The top element is: " + stack[top]);
    }

    public void isfull() {
        if (top == size - 1) {
            System.out.println("The stack is full");
        } else {
            System.out.println("The stack is not full");
        }
    }

    public void isempty() {
        if (top == -1) {
            System.out.println("the stack is empty");
        } else {
            System.out.println("the stack is not empty");
        }
    }

    public static void main(String[] args) {
        creatingStack stack1 = new creatingStack(4);
        stack1.isempty();
        stack1.isfull();

        stack1.push("helloWorld");
        stack1.push("belloWorld");
        stack1.peek();
        stack1.push("BelloMyanmar");
        stack1.push("HelloMyanamr");
        stack1.isfull();
        stack1.isempty();

        stack1.pop();
        stack1.pop();
        stack1.pop();

        stack1.isempty();
    }
}
