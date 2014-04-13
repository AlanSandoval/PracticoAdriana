/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto4;

/**
 *
 * @author AlanSandoval
 */
public class VentanaPrincipal {

    public static  void main(String args[])
    {
        //Clase de Interes
        Interes i = new Interes(10);
        //Clase que obtiene los observadores
        InteresAObservar o = new InteresAObservar();
        //Agrego a la lista, un nuevo observador
        i.addObserver(o);
        // si quiero que obsserve mas pongo i.addObserver(otra Ventana)
       // Modifico un valor, en este caso solo tenog 1 clase q modificar
        i.SetvalorInteres(100.45);
        
    }
}
