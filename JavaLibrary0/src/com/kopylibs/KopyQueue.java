/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kopylibs;

/**
 *
 * @author DELL-PC
 */
public class KopyQueue {
    int queue[],
            rear,
            front,
            size;//total number of elements in queue
    
    public KopyQueue(int sizeOfArray) {
        queue = new int[sizeOfArray];
        rear = -1;
        front = -1;
        size = 0;
    }
    public void isEmpty()
    {
        if(size == 0)
        {
            System.out.println("The Queue is empty.");
        }
        else
        {
            System.out.println("The Queue is not empty");
        }
    }
    public void enqueue(int element)
    {
        if(rear != queue.length - 1){
            rear++;
            queue[rear] = element;
            size++;
        }
    }
    public void  dequeue()
    {
        int response = 0;
    if(size != 0)
    {
        front++;
        response = queue[front];
        size--;
    }    
    }
    public void peek(){
        int response = 0;
        response = queue[front + 1];
        System.out.println("The first element is :"+ response);
        
    }
    public void getSize(){
        System.out.println("The total number of elements in Queue are : "+size);
    }
}
