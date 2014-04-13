/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto2;

/**
 *
 * @author AlanSandoval
 */
public class Derivador {
    Tpv tpv=null;
    
    public void BuscarMejorImpuesto(String buscarClase,double valor)
    {         
        if(buscarClase.equals("OperadorA"))
        {
            tpv = new OperadoraA(valor);
            tpv.ObtenerCalculo();
        }
        else if (buscarClase.equals("OperadorB"))
        {
            tpv = new OperadoraB(valor);
            tpv.ObtenerCalculo();
        }        
    }

    public Tpv getTpv() {
        return tpv;
    }
    
    
}
