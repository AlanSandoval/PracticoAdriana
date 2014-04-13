/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto4;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author AlanSandoval
 */
public class Interes extends Observable{
    
    double valorInteres;
    
    {
    }   
   
   public Interes(double valorInteres) {
        this.valorInteres = valorInteres;       
    }
   
   public void SetvalorInteres(double intere)
   {
       this.valorInteres=intere;
       //Informo el cambio 
       setChanged();
       //Notifico
       notifyObservers();
   }

   
   public double getInteres()
   {
       return this.valorInteres;
   }      
}
           

