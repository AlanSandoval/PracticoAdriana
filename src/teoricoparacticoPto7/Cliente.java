/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto7;

/**
 *
 * @author AlanSandoval
 */
public class Cliente  {
    public static void main (String args[])
    {
        Verificadora v= new Verificadora();
        Controlador c= new Controlador(new Activo());
        v.AddEspaciosAereos(new EspacioAereos(c));
        c.setE(new Inactivo());
        v.AddEspaciosAereos(new EspacioAereos(c));
        v.AddEspaciosAereos(new EspacioAereos(c));
          
        
        
   }
    
}
