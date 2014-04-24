package teoricoparacticoPto7;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author AlanSandoval
 */
public class Verificadora implements Observer{
    
    ArrayList<EspacioAereos> espacios = new ArrayList<EspacioAereos>();        
    
    public void AddEspaciosAereos(EspacioAereos a)
    {
        this.espacios.add(a);                     
    }

    @Override
    public void update(Observable o, Object arg) {       
    }
              
}
