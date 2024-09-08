/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_batch1;

import java.util.Stack;

/**
 *
 * @author DELL-PC
 */
public class StackNew {
    public static void main(String[] args) {
        Stack<Integer> snack_box = new Stack<>();
       snack_box.push(1);
       snack_box.push(2);
       snack_box.push(3);
       snack_box.push(4);
       snack_box.push(5);
       snack_box.push(6);
       
        System.out.println("The numbers of packages in snack_box: "+snack_box);
        
        System.out.println("The numbers of snack in the package at the top: "+snack_box.peek());
        
        snack_box.pop();
        System.out.println("After taken a package from the snack_box: "+snack_box);
    }
}
