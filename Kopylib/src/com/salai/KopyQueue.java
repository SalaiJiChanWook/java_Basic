/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salai;

/**
 *
 * @author DELL-PC
 */
public class KopyQueue {
    int queue[],
            rear,
            front,
            size;//The total number of Elements in Queue
    
    public KopyQueue(int sizeOfArray)
    {
        queue = new int [sizeOfArray];
        rear = -1;
        front = -1;
        size = 0;
    }
    
    public void isEmpty()
    {
        if(size == 0)
        {
            System.out.println("The Queue is Empty.");
        }
        else
        {
            System.out.println("The Queue is not Empty."+"\nIt has "+size+"Elements");
        }
    }
    
    public void offerQueue(int elements)
    {
        rear++;
        queue[rear] = elements;
        size++;
    }
    
    public void pollQueue()
    {
        int poll = 0;
        front++;
        poll = queue[front];
        size--;
    }
    
    public void peekQueue()
    {
        int response = 0;
        response = queue[front + 1];
        System.out.println("The First Element is: "+ response);
    }
    
    public void showSize()
    {
        System.out.println("The total number of Elements in Queue are : "+ size);
    }
    
}
