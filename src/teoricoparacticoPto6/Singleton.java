/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto6;

import java.util.ArrayList;

/**
 *
 * @author AlanSandoval
 */
public class Singleton {
    //Me aseguro que tenga una sola instancia
    static Singleton singleton;
    //Listo todo los productos
    ArrayList<Producto> productos = null;
    
    private Singleton()
    {
        productos= new ArrayList<Producto>();
    }
    
    public static Singleton getInstancia()
    {
        if (singleton==null)
        {
            singleton= new Singleton();
        }
        return singleton;
    }
    
    public void MostrarProducto()
    {
        for(Producto item:productos)
        {
            System.out.println("Producto: "+item.toString());
        }
    }
 
    public void CargarProducto(String id,String nombre,int precio)
    {
        productos.add(new Producto(id,nombre,precio));
    }
}
