package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class CoursCollectif extends Cours
{
    
    private int idCours;
    private int prixCours;
    private int nbPlaces;
    
    
    public CoursCollectif(int unId, String unNom, int unPrix, int unNbPlaces){
        prixCours = unPrix;
        nbPlaces = unNbPlaces;
    }
}
