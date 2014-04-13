package teoricoparacticoPto3;

/**
 *
 * @author AlanSandoval
 */
public class GenerarClases {
    public static void main(String[] args) {
        Dispositivo dispo= new DispositivoAlfa(new ControladorAlfa());
        dispo.MostrarNombreControlador();
        
        // Si Agrego muchos disopositivo, en una linea lo genero el dispositivo con su controlador
        // Independizo de una herencia
        Dispositivo dispo1= new DispositivoAlfa(new ControladorBeta());
        dispo1.MostrarNombreControlador();
  }
    
}
