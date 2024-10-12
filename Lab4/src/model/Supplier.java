/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author manasvini
 */
public class Supplier {
    
    private String supplyName;
    private Productcatalog productCatalog;
    private ImageIcon logoImage;

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public Productcatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(Productcatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    @Override
    public String toString() {
        return supplyName;
    }
    
}
