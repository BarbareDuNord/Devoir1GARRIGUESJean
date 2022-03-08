package Exo1;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class Planning extends Jours
{
   private ArrayList<Jours> lesJours;
   public Planning()
   {
       
   }

    /**
     * @return the lesJours
     */
    public ArrayList<Jours> getLesJours() {
        return lesJours;
    }

    /**
     * @param lesJours the lesJours to set
     */
    public void setLesJours(ArrayList<Jours> lesJours) {
        this.lesJours = lesJours;
    }
   
}
