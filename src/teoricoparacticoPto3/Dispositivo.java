/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto3;

/**
 *
 * @author AlanSandoval
 */
public abstract class Dispositivo {
    Controlador ctrl;

    public Dispositivo(Controlador ctrl) {
        this.ctrl = ctrl;
    }
    
    //Metodo abstracto para ejecutar del lado del controlador
    public abstract void MostrarNombreControlador();
}
