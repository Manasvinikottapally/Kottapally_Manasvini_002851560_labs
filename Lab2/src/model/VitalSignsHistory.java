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
public class VitalSignsHistory {
    ArrayList<VitalSigns>history;
    
    public VitalSignsHistory(){
        history = new ArrayList<VitalSigns>();
    }
    
    public VitalSigns addnewvitalsigns(){
        VitalSigns newvs = new VitalSigns();
        history.add(newvs);
        return newvs;
    }
    
    public void removevitalsigns(VitalSigns vs){
        history.remove(vs);
    }
    
    public ArrayList<VitalSigns> gethistory(){
        return history;
    }
    
    
}
