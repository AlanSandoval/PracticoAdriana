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
public class DispositivoAlfa extends Dispositivo{

    public DispositivoAlfa(Controlador ctrl) {
        super(ctrl);
    }   
    
    @Override
    public void MostrarNombreControlador() {
        System.out.println("Generando Controlador");
        super.ctrl.MostrarNombreControlador();
    }
    
}
