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
public class Cours
{
   private int idCours;
   private String nomCours;
   private int prixCours;
   
   public Cours(int unId, String unNom, int unPrix)
   {
       idCours = unId;
       nomCours = unNom;
       prixCours = unPrix;
   }

    /**
     * @return the idCours
     */
    public int getIdCours() {
        return idCours;
    }

    /**
     * @param idCours the idCours to set
     */
    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    /**
     * @return the nomCours
     */
    public String getNomCours() {
        return nomCours;
    }

    /**
     * @param nomCours the nomCours to set
     */
    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    /**
     * @return the prixCours
     */
    public int getPrixCours() {
        return prixCours;
    }

    /**
     * @param prixCours the prixCours to set
     */
    public void setPrixCours(int prixCours) {
        this.prixCours = prixCours;
    }
   
}
