/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto5;

/**
 *
 * @author AlanSandoval
 */
public class Firma extends AgregoDatos{

    public Firma(Email email) {
        super(email);
    }

    @Override
    public String getDescripcion() {
        //Agrego mas datos, Wrapper
        return email.getDescripcion()+" Firma Alan Sandoval";
    }
    
    
}
