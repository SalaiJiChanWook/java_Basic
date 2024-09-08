/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.ArrayList;



public class ArrayListPrimitiveHW {
    public static void main(String[] args) {
        ArrayList <Integer>EvenNumber = new ArrayList<>();
        
        EvenNumber.add(2);
        EvenNumber.add(4);
        EvenNumber.add(6);
        EvenNumber.add(8);
        EvenNumber.add(10);
        
        System.out.println("List OF The EvenNumber: "+EvenNumber);
        
        EvenNumber.remove(0);
        System.out.println("New List of EvenNumber: "+EvenNumber);
        
        int pointer = EvenNumber.get(3);
        System.out.println("Number at the index 3: "+pointer);
        
        EvenNumber.set(3,16);
        System.out.println("Final expression: "+EvenNumber);
    }
}
