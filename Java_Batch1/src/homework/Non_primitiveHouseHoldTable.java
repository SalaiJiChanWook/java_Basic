/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DELL-PC
 */
public class Non_primitiveHouseHoldTable {
    public static void main(String[] args) {
        ArrayList<Household> table = new ArrayList<Household>();
        Household h1 = new Household("7/MaHtaLa(naing) 001","MG KyawGyi","U AungThu","Daw BokeSone",20);
        Household h2 = new Household("7/MaHtaLa(naing) 002","MG HtooKhantThaw","U NaingLu","Daw KhinMaMa",22);
        Household h3 = new Household("7/MaHtaLa(naing) 003","MA KhinThitSar","U AungWin","Daw SarOo",24);
        Household h4 = new Household("7/MaHtaLa(naing) 004","MA YoungChiThway","U Bal Thu","Daw MiDote",26);
        
        table.add(h1);
        table.add(h2);
        table.add(h3);
        table.add(h4);
        
        System.out.printf("%-40s%-20s%-20s%-20s%-10s","ID","Name","FatheName","MotheName","Age");
        System.out.println("\n============================================================================================");
        
        Iterator itr = table.iterator();
        while(itr.hasNext()){
            Household Hh = (Household)itr.next();
            System.out.printf("%-40s%-20s%-20s%-20s%-10s",Hh.getID(),Hh.getName(),Hh.getFather_name(),Hh.getMother_name(),Hh.getAge());
            System.out.println();
        }
    }
}
