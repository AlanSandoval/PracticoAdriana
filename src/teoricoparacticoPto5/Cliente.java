/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoricoparacticoPto5;

/**
 *
 * @author AlanSandoval
 */
public class Cliente {

    public static void main (String args[])
    {
       Email email = new EnviarEmail();
       email = new Asunto(email);
       email = new Mensaje(email);
       email = new Firma(email);
       System.out.println(email.getDescripcion());
       
    }
    
}
