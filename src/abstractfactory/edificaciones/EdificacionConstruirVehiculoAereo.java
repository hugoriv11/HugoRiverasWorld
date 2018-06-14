/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificaciones;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class EdificacionConstruirVehiculoAereo implements Edificacion{
    public int vida;
    public int precio = 200;

    @Override
    public void construir() {
        vida = 100;
        System.out.println("Edificacion constructora vehiculos aereos construida " + "// vida: (" + vida + ")"
                        + " // precio " + precio);
    }
    
}
