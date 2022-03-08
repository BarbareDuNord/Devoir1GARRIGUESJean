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
public class Jour 
{
    private int idJour;
    private String nomJour;
    private ArrayList<Cours> LesCours;
    
    public Jour(int unId, String unNom){
        idJour = unId;
        nomJour = unNom;
    }
}
