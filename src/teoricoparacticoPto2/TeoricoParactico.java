
package teoricoparacticoPto2;

/**
 *
 * @author AlanSandoval
 */
public class TeoricoParactico {
    
    public static void main(String[] args) {
       Derivador derivador = new Derivador();
       derivador.BuscarMejorImpuesto("OperadorA",100);
       System.out.println("Resultado: " +derivador.tpv.resultado);
       derivador.BuscarMejorImpuesto("OperadorB",100);
       System.out.println("Resultado: " +derivador.tpv.resultado);
    }
    
}
