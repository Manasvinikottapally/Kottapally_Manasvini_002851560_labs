/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manasvini
 */
public class Features {
    
    private Product owner;
    private String Name;
    private  Object value;

    public Features() {
    }
    
    private Features(Product owner){
        this.owner = owner;
    }
    
    public Features(Product owner, String Name, Object value){
        this.Name = Name;
        this.value = value;
    }

    public Product getOwner() {
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
        return Name;
    }
    
}
