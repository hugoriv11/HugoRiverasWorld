/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.razas;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class Nazis implements Raza{
    //atri
    
    public int recurso1 = Raza.recurso1;
    public int recurso2 = Raza.recurso2;
    public int recurso3 = Raza.recurso3;
    
    @Override
    public void crear() {
        System.out.println("Raza Nazi elegida");
        System.out.println("RECURSOS INICIALES " + "Recurso 1: " + recurso1 + " | " + "Recurso 2: " + recurso2 + " | " + "Recurso 3: " + recurso3);
    }
    
}
