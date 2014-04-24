
package teoricoparacticoPto7;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author AlanSandoval
 */
public class Controlador extends Observable{

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
        setChanged();
        notifyObservers();
    }

    
}
