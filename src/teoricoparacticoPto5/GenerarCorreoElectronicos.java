package teoricoparacticoPto5;

/**
 *
 * @author AlanSandoval
 */
public class GenerarCorreoElectronicos {

    Email email;
    
    public GenerarCorreoElectronicos() {
    }
    
    public void CrearEmail()
    {
       this.email = new CrearEmail();
       this.email = new Asunto(email);
       this.email = new Mensaje(email);
       this.email = new Firma(email);
        System.out.println(this.email.getDescripcion());
           
    }
    
    public void EnviarEmail()
    {
       this.email = new EnviarEmail();
       System.out.println(this.email.getDescripcion());
    }
    

}
