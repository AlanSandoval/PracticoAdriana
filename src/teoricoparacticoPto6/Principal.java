/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto6;

/**
 *
 * @author AlanSandoval
 */
public class Principal {
    public static void main(String []args)
    {
        Singleton.getInstancia().CargarProducto("1","Galletitas",20);
        Singleton.getInstancia().CargarProducto("2","Harina",60);
        Singleton.getInstancia().MostrarProducto();
    }
}
