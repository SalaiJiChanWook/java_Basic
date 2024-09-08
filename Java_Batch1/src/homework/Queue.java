/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.PriorityQueue;

/**
 *
 * @author DELL-PC
 */
public class Queue {
    public static void main(String[] args) {
        
        PriorityQueue<String> q = new PriorityQueue<String>();
        
        q.offer("AungAung");
        q.offer("KyawKyaw");
        q.offer("MaungMaung");
        
        System.out.printf("%s ", q);
        System.out.println();
        
        System.out.printf("%s ",q.peek());
        System.out.println();
        
        q.poll();
        System.out.printf("%s",q);
    }
}
