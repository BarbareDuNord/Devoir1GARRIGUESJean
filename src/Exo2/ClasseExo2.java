/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo2;

/**
 *
 * @author jbuffeteau
 */
public class ClasseExo2
{
    public static double CalculerForfait(boolean licencie, int age,boolean carteNeige, boolean assurance)
    {
        double forfait = 0;
        if(age > 12)
        {
            forfait += 30;
        }
        
        if(age < 12){
            forfait += 20;
        }
        
        if(licencie == true)
        {
            forfait += 13;
        }
        
        if(carteNeige == true)
        {
            forfait = forfait - 0.1*forfait;
        }
        
        if(assurance == true)
        {
            forfait = forfait + 3;
        }
        return 0;
    }
}
