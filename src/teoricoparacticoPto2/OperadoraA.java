package teoricoparacticoPto2;

/**
 *
 * @author AlanSandoval
 */
public class OperadoraA extends Tpv{
    double valor=0;     

    public  OperadoraA(double valor)
    {       
        this.valor=valor;
    }
    
    @Override
    void ObtenerCalculo() {
        super.resultado=valor*1.15;             
    }
    
    
}
