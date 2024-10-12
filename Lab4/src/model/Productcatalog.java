/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author manasvini
 */
public class Productcatalog {
    
    private ArrayList<Product> productCatalog;
    
    public Productcatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }
    
    public Product searchProduct(int ID) {

        for(Product p : productCatalog) {
            if(p.getID() == ID) {
                return p;
            }
        }
        return null;
    }
    
    public int getProductCount(){
        return productCatalog.size();
    }
    
}
