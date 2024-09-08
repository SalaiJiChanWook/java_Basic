/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import com.salai.KopyQueue;

/**
 *
 * @author DELL-PC
 */
public class CreatingQueue {
    public static void main(String[] args) {
        KopyQueue kq = new KopyQueue(10);
        
        kq.offerQueue(1000);
        kq.offerQueue(2000);
        kq.offerQueue(3000);
        
        kq.isEmpty();
        
        kq.peekQueue();
        
        kq.showSize();
        kq.pollQueue();
        kq.peekQueue();
        kq.isEmpty();
    }
}
