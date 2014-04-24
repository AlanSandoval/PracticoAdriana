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
public class Asignado implements Estados{

    Verificadora v;
    public Asignado() {
    }
    
    public Asignado(Verificadora v)
    {
        this.v=v;
    }
    @Override
    public String getEstado() {
        return "Esta Asignado";
    }
    
    
}
