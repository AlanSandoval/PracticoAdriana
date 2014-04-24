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
public class Activo implements Estados
{    

    public Activo()
    {
       
    }
    
    @Override
    public String getEstado() {
        return "Esta Activo";
    }
    
}
