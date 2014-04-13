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
public class InteresAObservar implements Observer{

    public InteresAObservar() {
        
    }

    
    @Override
    public void update(Observable o, Object arg) {
       
        if(o instanceof Interes)
        {
            System.out.println("Nuevo Interes: "+((Interes)o).getInteres());
        }
        //arg creo que contiene el valor que cambio
    }
    
}
