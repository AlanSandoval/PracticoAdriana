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
public class Mensaje extends AgregoDatos{

    public Mensaje(Email email) {
        super(email);
    }

    
    @Override
    public String getDescripcion() {
        return email.getDescripcion()+"Este email es para corroborar que puedo enviar Email"+"\n";
    }
    
}
