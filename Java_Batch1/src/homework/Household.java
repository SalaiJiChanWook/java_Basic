/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author DELL-PC
 */
public class Household {
    private String Name,Father_name,Mother_name,ID;
    private int Age;
    
    public Household(String ID,String Name,String Father_name,String Mother_name,int Age) {
        this.ID = ID;
        this.Name = Name;
        this.Father_name = Father_name;
        this.Mother_name = Mother_name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFather_name() {
        return Father_name;
    }

    public void setFather_name(String Father_name) {
        this.Father_name = Father_name;
    }

    public String getMother_name() {
        return Mother_name;
    }

    public void setMother_name(String Mother_name) {
        this.Mother_name = Mother_name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
}
