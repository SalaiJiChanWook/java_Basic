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
public class Stacks {
    public static void main(String[] args) {
        Stack <String> animals = new Stack <> ();
        animals.push("Horse");
        animals.push("dog");
        animals.push("donkey");
        animals.push("cst");
        
        System.out.println("The list of animals are: " + animals);
        System.out.println("the animal from the last index is " +animals.peek());
        
        animals.pop();
        
        System.out.println("The new list is "+ animals);
        
        System.out.println("is the stack is  full ?"+ animals.empty());
    }
}
