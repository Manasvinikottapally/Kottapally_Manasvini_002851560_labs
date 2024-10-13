/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author manasvini
 */
public class Product {
    
    private String Name;
    private int Price;
    private int ID;
    private ImageIcon logoImage;
    
    private ArrayList<Features> features;
    private static int count = 0;
    
    public ArrayList<Features> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Features> features) {
        this.features = features;
    }
    
    public Product() {
        count++;
        ID = count;
        
        features = new ArrayList<Features>();
        
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
    
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    
    @Override
    public String toString() {
        return Name;
    }
    
    public Features addNewFeature() {
        Features NewFeature = new Features();
        features.add(NewFeature);
        return NewFeature;
    }
    
}
