
package teoricoparacticoPto2;

/**
 *
 * @author AlanSandoval
 */
public class OperadoraB extends  Tpv{

    double valor=0;     

    public  OperadoraB(double valor)
    {
        this.valor=valor;        
    }
    
    @Override
    void ObtenerCalculo() {
        super.resultado=valor*2.20;        
    }
    
}
