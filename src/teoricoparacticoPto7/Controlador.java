
package teoricoparacticoPto7;

/**
 *
 * @author AlanSandoval
 */
public class Controlador {

    Estados e;

    public Controlador() {
    }

    public Controlador(Estados e) {
        this.e = e;
    }    
    
    public Estados getE() {
        System.out.println("Estado: " + e.getEstado());
        return e;
    }

    public void setE(Estados e) {
        this.e = e;
    
    }
    
}
